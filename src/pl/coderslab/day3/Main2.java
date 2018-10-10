package pl.coderslab.day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Main2 {


    public static void main(String[] args) {
        String QUERY4 = "INSERT INTO product2(name, description) VALUES(?,?);";

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3366/gdaso1sh?useSSL=false&characterEncoding=utf8",
                "root", "root");
             PreparedStatement stat = conn.prepareStatement(QUERY4)) {
            String name = "xiaomi";
            String description = "super xiaomi";
            stat.setString(1, name);
            stat.setString(2, description);
            stat.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
