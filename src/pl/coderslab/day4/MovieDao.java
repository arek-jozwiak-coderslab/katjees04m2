package pl.coderslab.day4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieDao {


    private static final String QUERY_SELECT = "SELECT * from movies where id=?;";

    public  Movie getById(long searchId) {
        Movie movie = null;
        try (Connection conn = DbUtil.getConnection("cinemas_ex");
             PreparedStatement stat = conn.prepareStatement(QUERY_SELECT);
        ) {
            stat.setLong(1, searchId);
            try (ResultSet rs = stat.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String title = rs.getString("title");
                    double rating = rs.getDouble("rating");
                    String description = rs.getString("description");
                    String director = rs.getString("director");
                    movie = new Movie(id, title, description, rating, director);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movie;
    }

}
