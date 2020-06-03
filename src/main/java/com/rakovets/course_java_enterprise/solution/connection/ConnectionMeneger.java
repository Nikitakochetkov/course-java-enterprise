package main.java.com.rakovets.course_java_enterprise.solution.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMeneger {
    private static final String DATASOURSE_DRIVER = "jdbc:mysql://localhost:3306/restaurant?useUnicode=true&serverTimezone=UTC";
    private static final String DATASOURSE_USER = "root";
    private static final String DATASOURSE_PASSWORD = "root";

    public static Connection createConnection() {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DATASOURSE_DRIVER, DATASOURSE_USER, DATASOURSE_PASSWORD);
        } catch (SQLException e) {
            System.out.println("SQLException" + e);
        }
        return connection;
    }

}
