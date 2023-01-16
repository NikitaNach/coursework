package ru.studwork.project.server;

import ru.studwork.project.data.Sample;
import ru.studwork.project.services.SampleService;

import java.sql.*;
import java.util.List;
import java.util.UUID;

public class SampleServiceimp implements SampleService {
    private String url = "jdbc:postgresql://localhost/obrs";
    private String login = "postgres";
    private String password = "123";
    @Override
    public String addSample(Sample sample){
        try{
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        try{
            String id = UUID.randomUUID().toString();
            sample.setId(id);
            Connection conn=DriverManager.getConnection(url,login,password);
            Statement statement=conn.createStatement();
            String sql="INSERT INTO samples(id,Sam_numbername,Sam_texture,Sam_structure,Sam_composition,Sam_paleo) VALUES(\'" + sample.getId() + "\', \'" + sample.getNumbername() + "\',\'" + sample.getTexture() +"\',\'"+ sample.getStructure() +"\',\'" + sample.getComposition() +"\',\'" + sample.getPaleo() +"\')";
            statement.execute(sql);
            statement.close();
            conn.close();
            return id;
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delSample(String id) {
        try {
            Connection conn = DriverManager.getConnection(url, login, password);
            Statement statement = conn.createStatement();
            String sql = "DELETE FROM samples WHERE id='" + id + "'";
            statement.execute(sql);
            statement.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public Sample getSample(String id){
        try {
            Connection conn = DriverManager.getConnection(url, login, password);
            Statement statement = conn.createStatement();
            String sql = "SELECT Sam_numbername FROM products WHERE id='" + id + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            Sample sample=null;
            if (resultSet.next()){
                sample=new Sample();
                sample.setId(id);
                sample.setNumbername(resultSet.getString("Sam_numbername"));
            }
            statement.close();
            conn.close();
            return sample;
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Sample> getSampleList() {
        return null;
    }
}
