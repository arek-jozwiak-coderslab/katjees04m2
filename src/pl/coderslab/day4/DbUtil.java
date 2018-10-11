package pl.coderslab.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static String DB_URL = "jdbc:mysql://localhost:3366/";
    private static String DB_PARAMS = "?useSSL=false&useUnicode=yes&characterEncoding=UTF-8";
    private static String DB_USER = "root";
    private static String DB_PASS = "root";

    public static Connection getConnection(String db) throws SQLException {

        return DriverManager.getConnection(DB_URL + db + DB_PARAMS, DB_USER, DB_PASS);
    }
}