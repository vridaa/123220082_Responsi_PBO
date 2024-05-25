package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    private static String dbName = "universitas";
    private static String dbUrl = "jdbc:mysql://localhost:3306/" + dbName;
    private static String dbUsername = "root";
    private static String dbPassword = "";

    static Connection conn;

    public static Connection Connect() {
        try {
            // Explicitly load the MySQL JDBC driver
            Class.forName(jdbcDriver);
            // Establish the connection
            conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            System.out.println("MySQL Connected");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }
        return conn;
    }
}