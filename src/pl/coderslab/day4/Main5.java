package pl.coderslab.day4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Main5 {

    public static void main(String[] args) {

        MovieDao movieDao = new MovieDao();
        Movie movie = movieDao.getById(5);
        movie.setDescription("asdasd");
        System.out.println(movie);
    }

}
