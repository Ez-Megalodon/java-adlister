package dao;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {

        private static  List<String> getAlbumsNames(){

                List<String> albumNames = new ArrayList<>();

                try {
                        //establish connection to database
                        DriverManager.registerDriver(new Driver());
                        Connection connection = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                                "root",
                                "codeup"
                        );
                        //create statement
                        Statement statement = connection.createStatement();
                        //execute statement
                        ResultSet resultSet = statement.executeQuery("SELECT DISTINCT artist FROM codeup_test_db.albums");
                        while(resultSet.next()){
                                albumNames.add(resultSet.getString("artist"));
                        }

                } catch (SQLException sqlx){
                        sqlx.printStackTrace();
                }
                return albumNames;
        }

        public static void main(String[] args) {
                for (String name: getAlbumsNames()){
                        System.out.println(name);
                }
        }
}
