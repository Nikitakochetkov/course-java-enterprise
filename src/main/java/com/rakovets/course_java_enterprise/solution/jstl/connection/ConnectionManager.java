package com.rakovets.course_java_enterprise.solution.jstl.connection;

import javax.sql.DataSource;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class ConnectionManager {
    private static final String DATASOURCE_URL = "jdbc:mysql://localhost:3306/restaurant?useUnicode=true&serverTimezone=UTC";
    private static final String DATASOURCE_USER = "root";
    private static final String DATASOURCE_PASSWORD = "root";
    private static final String JDBC_DRIVER = "org.mysql.jdbc.Driver";

    static {
        try {
            Class.forName(JDBC_DRIVER).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private ConnectionManager() {}

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATASOURCE_URL, DATASOURCE_USER, DATASOURCE_PASSWORD);
    }
}
