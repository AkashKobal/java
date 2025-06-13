package org.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MySQLConnection {
    private static String MYSQL_DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String MYSQL_DB_URL = "jdbc:mysql://localhost:3308/udemy_jdbc";
    private static String MYSQL_DB_USERNAME = "root";
    private static String MYSQL_DB_PASSWORD = "Akash@123";

    public Connection getFileFromResources() {

        Properties prop = new Properties();
        try {
            Class.forName(MYSQL_DB_DRIVER);
            Connection dbConn = DriverManager.getConnection(MYSQL_DB_URL,
                    MYSQL_DB_USERNAME, MYSQL_DB_PASSWORD);

            if (dbConn != null) {
                System.out.println("Connection Successful");
            } else {
                System.out.println("Failed to make connection!");
            }
            return dbConn;
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("SQL Exception in close connection method");
            }
        }
    }

    public static void close(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                System.out.println("SQL Exception in close statement method");
            }
        }
    }

    public static void close(ResultSet rSet) {
        if (rSet != null) {
            try {
                rSet.close();
            } catch (SQLException e) {
                System.out.println("SQL Exception in close resultset method");
            }
        }
    }
}