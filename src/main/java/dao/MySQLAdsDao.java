package dao;

import com.mysql.cj.jdbc.Driver;
import config.Config;
import models.Ad;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements AdsDao{
    private Connection connection;

    public MySQLAdsDao(Connection connection, Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUser(),
                    Config.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Ad> all() {
        // Get a reference to the authors Data Access Object
        // so I can retrieve the list of authors
//        Authors authorsDao = new AuthorsDao();
        // retrieve all the authors in the database
        // Store the list in a List called authors
//        List<Author> authors = authorsDao.all();
        // Then I create a list to store the quotes
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            // retrieve all the quotes from the database
            ResultSet resultSet = statement.executeQuery("SELECT * FROM adlister_db.ads");
            // I start looping over the quotes I retrieved from the db
            while (resultSet.next()){
                // For each quote, I get the author id
                int author_id = resultSet.getInt("author_id");
                // I create a an Author object that will hold the author information corresponding to the author id
//                Author quoteAuthor = null;
                // I loop over the list of all the authors
//                for (Author author : authors){
//                    // If I find a match between the author ids, I set the value of the author object
//                    if (author.getId() == author_id){
//                        quoteAuthor = author;
//                    }
//                }
                // In the constructor, I add the Author object
                Ad ad = new Ad(
                        resultSet.getLong("id"),
                        resultSet.getLong("userID"),
                        resultSet.getString("title"),
                        resultSet.getString("description")
                );
                ads.add(ad);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }

    public MySQLAdsDao(){
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
