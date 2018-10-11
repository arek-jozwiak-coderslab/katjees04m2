package pl.coderslab.day4;

import java.sql.*;
import java.util.Scanner;


public class Main1 {
    private static final String QUERY_SELECT = "SELECT * from movies;";
    private static final String QUERY_DELETE = "DELETE from movies WHERE id = ?";

    public static void main(String[] args) {
        try (Connection conn = DbUtil.getConnection("cinemas_ex");
             PreparedStatement stat = conn.prepareStatement(QUERY_SELECT);
             ResultSet rs = stat.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String rating = rs.getString("rating");

                System.out.println(id + " - " + title + " - " + " - " + rating);
            }

            System.out.println("Podaj id do usunięcia: ");
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();

            try (PreparedStatement stat2 = conn.prepareStatement(QUERY_DELETE)) {
                stat2.setInt(1, id);
                stat2.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
