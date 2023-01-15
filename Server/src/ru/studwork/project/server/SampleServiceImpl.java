package ru.studwork.project.server;

import ru.studwork.project.data.Sample;
import ru.studwork.project.services.SampleService;

import java.sql.*;
import java.util.UUID;

public class SampleServiceimp implements SampleService {
    private String url = "jdbc:postgresql://localhost/obrs";
    private String login = "postgres";
    private String password = "123";
    @Override
    public String addSample(Sample sample){
        try{
            Class.forName("org.postgresql.Driver")
        } catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        try{
            String id = UUID.randomUUID().toString();
            Sample.setId(id);
            Connection conn=DriverManager.getConnection(url,login,password);
            Statement statement=conn.createStatement();
            String sql="INSERT INTO samples(id,numbername,texture,structure,composition,paleo) VALUES(\'" + sample.getId() + "\', \'" + sample.getNumbername() + "\',\'" + sample.getTexture() +"\',\'"+ sample.getStructure() +"\',\'" + sample.getComposition() +"\',\'" + sample.getPaleo() +"\')";
        }
    }
}
