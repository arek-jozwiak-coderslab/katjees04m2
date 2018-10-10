package pl.coderslab.day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Main2 {


    public static void main(String[] args) {
        String QUERY4 = "INSERT INTO products(name, description, price) VALUES(?,?,?);";

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3366/products_ex?useSSL=false&characterEncoding=utf8",
                "root", "root");
             PreparedStatement stat = conn.prepareStatement(QUERY4)) {
            String name = "xiaomi";
            String description = "super xiaomi";
            double price = 3.0;
            stat.setString(1, name);
            stat.setString(2, description);
            stat.setString(2, description);
            stat.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
