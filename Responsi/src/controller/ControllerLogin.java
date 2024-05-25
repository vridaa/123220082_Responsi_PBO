package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Connector;

public class ControllerLogin {

    public boolean authenticate(String username, String password) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // Connect to the database
            connection = Connector.Connect();

            // SQL query to check username and password
            String query = "SELECT * FROM mahasiswa WHERE username = ? AND password = ?";

            // Prepare the statement
            statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);

            // Execute the query
            resultSet = statement.executeQuery();

            // If a record is found, authentication is successful
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace(); // Log the exception for debugging
        } finally {
            // Close resources to avoid resource leaks
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // Authentication failed
        return false;
    }
}
