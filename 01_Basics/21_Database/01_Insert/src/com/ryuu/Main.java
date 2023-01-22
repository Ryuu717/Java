package com.ryuu;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:/Volumes/Production/Courses/Programs/JavaPrograms/TestDB/testjava.db");
//            Statement statement = conn.createStatement()) {
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/Ryuuuu/IdeaProjects/Completed-Topics-Source-code/21_Database/Insert,-Update,-Delete/database.db");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
                              " (name TEXT, phone INTEGER, email TEXT)");

            //Add data
            statement.execute("INSERT INTO contacts (name, phone, email) " +
                              "VALUES('Joe', 45632, 'joe@anywhere.com')");

            statement.execute("INSERT INTO contacts (name, phone, email) " +
                    "VALUES('Jane', 4829484, 'jane@somewhere.com')");

            statement.execute("INSERT INTO contacts (name, phone, email) " +
                    "VALUES('Fido', 9038, 'dog@email.com')");

            //Show
            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while(results.next()) {
                System.out.println(results.getString("name") + " " +
                                   results.getInt("phone") + " " +
                                   results.getString("email"));
            }

            results.close();

            statement.close();
            conn.close();


        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
