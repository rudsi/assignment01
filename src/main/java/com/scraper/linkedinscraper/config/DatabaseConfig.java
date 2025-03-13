package com.scraper.linkedinscraper.config;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;

import java.util.Properties;

public class DatabaseConfig {

    private static String dbUrl;
    private static String dbUsername;
    private static String dbPassword;
    private static Connection connection;

    static {
        try (InputStream input = DatabaseConfig.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new RuntimeException("Unable to find application.properties");
            }
            Properties props = new Properties();
            props.load(input);

            dbUrl = props.getProperty("spring.datasource.url");
            dbUsername = props.getProperty("spring.datasource.username");
            dbPassword = props.getProperty("spring.datasource.password");

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            System.out.println("Database connection established successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("Failed to initialize database connection: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}