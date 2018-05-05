package com.postgres.jdbc;

import java.sql.*;

public class DBConnectionTest {

    private static final String url = "jdbc:postgresql://ravikanth-postgres.cw4joqqlecjd.eu-west-1.rds.amazonaws.com:5432/postgres";
    private static final String user = "ravikanthpostgres";
    private static final String password = "Ananya$9036";

    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection(url, user, password); Statement statement = con.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from account_role")) {
           while (resultSet.next()) {
                System.out.println(resultSet.getInt(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
