package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactoryTest {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        
    }
}
