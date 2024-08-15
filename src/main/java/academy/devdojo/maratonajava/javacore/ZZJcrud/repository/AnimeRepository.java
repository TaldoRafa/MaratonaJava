package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;

import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class AnimeRepository {
    public static List<Anime> findByName(String name) {
        log.info("Finding Anime by name '{}'", name);
        List<Anime> animes = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery();) {

            while (rs.next()) {
                Producer producer = Producer.builder().name(rs.getString("producer_name"))
                        .id(rs.getInt("producer_id"))
                        .build();

                Anime anime = Anime
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();

                animes.add(anime);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all Animes");
            throw new RuntimeException(e);
        }
        return animes;
    }

    private static PreparedStatement createPrepareStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name' FROM anime_store.anime a inner join
                anime_store.producer p on a.producer_id = p.id
                where a.name like ?;
                """;

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "%%%s%%".formatted(name));
        return ps;
    }

    public static Optional<Anime> findById(Integer id) {
        log.info("Finding Anime by id '{}'", id);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery();) {

            if (!rs.next()) return Optional.empty();
            Producer producer = Producer.builder().name(rs.getString("producer_name"))
                    .id(rs.getInt("producer_id"))
                    .build();

            Anime anime = Anime
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .episodes(rs.getInt("episodes"))
                    .producer(producer)
                    .build();

            return Optional.of(anime);
        } catch (SQLException e) {
            log.error("Error while trying to find all Animes");
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createPrepareStatementFindById(Connection connection, Integer id) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name' FROM anime_store.anime a inner join
                anime_store.producer p on a.producer_id = p.id
                where a.id = ?;
                """;

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void delete(int id) {

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementDelete(conn, id)) {

            ps.execute();
            log.info("Deleted Anime '{}' in the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete Anime '{}'", id, e);
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createPrepareStatementDelete(Connection connection, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`anime` WHERE (`id` = ?);";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Anime anime) {
        log.info("Saving Anime '{}'", anime.getName());

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementSave(conn, anime);) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to saving Anime '{}'", anime.getId(), e);
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createPrepareStatementSave(Connection connection, Anime anime) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`anime` (`name`, `episodes`, `producer_id`) VALUES (?, ?, ?);";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getProducer().getId());
        return ps;
    }

    public static void update(Anime anime) {
        log.info("Updating Anime '{}'", anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementUpdate(conn, anime)) {

            ps.execute();
            log.info("Updated Anime '{}'", anime.getId());

        } catch (SQLException e) {

            log.error("Error while trying to update Anime '{}'", anime.getId(), e);
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createPrepareStatementUpdate(Connection connection, Anime anime) throws SQLException {
        String sql = "UPDATE `anime_store`.`anime` SET `name` = ?, `episodes` = ? WHERE (`id` = ?);";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getId());
        return ps;
    }
}
