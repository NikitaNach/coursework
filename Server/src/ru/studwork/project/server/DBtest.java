package ru.studwork.project.server;

import ru.studwork.project.api.data.sample;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DBtest {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/obrs";
        String login = "postgres";
        String password = "123";
        try {
            Connection conn = DriverManager.getConnection(url,login,password);
            Statement statement =conn.createStatement();
            //statement.executeUpdate(); //Возвращает кол-во строчек где есть апдейт
            //String sql = "CREATE TABLE samples ( id varchar(60) NOT NULL, sample_paleo varchar(10) NOT NULL, PRIMARY KEY (id));";
            String sql = "INSERT INTO products(id, sample_paleo) VALUES (\'" + UUID.randomUUID()+ "\', \'Телевизор\')";
            statement.execute(sql);
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
