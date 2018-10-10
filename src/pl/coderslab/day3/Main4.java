package pl.coderslab.day3;

import java.sql.*;


public class Main4 {


    public static void main(String[] args) {
        String QUERY4 = "SELECT avg(rating) as rat from movies;";

        String QUERY5 = "SELECT * FROM movies where rating > ?";
        double rat = 0;
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3366/cinemas_ex?useSSL=false&characterEncoding=utf8",
                "root", "root");
             PreparedStatement stat = conn.prepareStatement(QUERY4);
             PreparedStatement stat2 = conn.prepareStatement(QUERY5);
             ResultSet rs = stat.executeQuery()) {

            while (rs.next()) {
                rat = rs.getDouble("rat");
            }

            stat2.setDouble(1, rat);

            try( ResultSet rs2 = stat2.executeQuery()){
                while (rs2.next()) {
                    System.out.println(rs2.getString("title"));
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
