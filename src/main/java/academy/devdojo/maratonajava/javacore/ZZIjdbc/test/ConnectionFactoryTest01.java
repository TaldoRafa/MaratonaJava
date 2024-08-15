package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.sql.SQLException;
import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) throws SQLException {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("madhouse").build();
        // ProducerService.save(producer);
        // ProducerService.delete(9);
        // ProducerService.update(producerToUpdate);
        // List<Producer> producers = ProducerService.findAll();
        // List<Producer> producers = ProducerService.findByName("Mad");
        // ProducerService.showProducerMetadata();
        // ProducerService.showDriverMetaData();
        // ProducerService.showTypeScrollWorking();
        // List<Producer> deen = ProducerService.findByNameAndUpdateToUpperCase("Deen");
        // List<Producer> deen = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
        // ProducerService.findByNameAndDelete("A-1 pictures");
        // List<Producer> producers = ProducerService.findByNamePreparedStatement("Bones");
        // log.info("Producers found '{}'", producers);
        // log.info(producers);
        // ProducerService.updatePreparedStatement(producerToUpdate);

        List<Producer> producers = ProducerService.findByNameCallableStatement("Bo");
        log.info("Producers found '{}'", producers);
    }
}
