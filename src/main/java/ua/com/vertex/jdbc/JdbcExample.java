package ua.com.vertex.jdbc;

import java.sql.*;

public class JdbcExample {

    private static final String URL = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11170448";


    private static final String USERNAME = "sql11170448";
    private static final String PASSWORD = "3hS99tes9Q";

    private static final String SELECT_FROM_CARS_WHERE_OWNER_ID =
            "SELECT GOV_NUMBER, Mark, Color, owner_id " +
                    "FROM  Cars " +
                    "WHERE owner_id = ?";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_CARS_WHERE_OWNER_ID)) {

            preparedStatement.setInt(1, 2);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("owner_id");
                String color = resultSet.getString("color");
                String mark = resultSet.getString("mark");
                String govNumber = resultSet.getString("GOV_NUMBER");

                System.out.println(
                        String.format("User with id %d has car %s %s with number %s"
                                , id, color, mark, govNumber));
                ;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
