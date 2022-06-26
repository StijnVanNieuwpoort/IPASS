package webservices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ContactProgram {
    public void sql(String query) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/IPASS";
        String username = "postgres";
        String password = "ikikik29";

        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("connected");

            Statement statement = connection.createStatement();

            statement.execute(query);

            connection.close();
        } catch (SQLException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
