package dao;

import com.mysql.cj.jdbc.Driver;
import models.Album;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlbumDao implements Albums{

    private Connection connection;

    public AlbumDao(){
        try{
            //establish connection to database
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );
        } catch (SQLException sqlx){
            throw new RuntimeException("Error connecting to database");
        }
    }

    @Override
    public List<Album> all() {
        List<Album> albums = new ArrayList<>();
        try{
            //create statement
            Statement statement = connection.createStatement();
            //execute statement
            ResultSet resultSet = statement.executeQuery("SELECT DISTINCT * FROM codeup_test_db.albums");
            while(resultSet.next()){
                Album album = new Album(
                        resultSet.getLong("id"),
                        resultSet.getString("artist"),
                        resultSet.getString("name"),
                        resultSet.getString("genre")
                );
                albums.add(album);
            }
        } catch (SQLException sqlx){
            throw new RuntimeException("Error connecting to db");
        }
        return albums;
    }

    @Override
    public void insert(Album album) {

    }
}
