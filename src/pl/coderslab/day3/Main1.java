package pl.coderslab.day3;

import java.sql.*;

/**
 * #select id, description from product;
 * #select * from product;
 * <p>
 * #insert into product value (null, 'iphone', 'ooooooo');
 * #insert into product (id, name) value (null, 'iphone');
 * <p>
 * #delete from product where id=1;
 * <p>
 * #UPDATE product SET description = 'super telfon';
 * UPDATE product SET description = 'super telfon' where id =2;
 */
public class Main1 {

    private static final String QUERY1 = "CREATE TABLE product2 (\n" +
            "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
            "  `name` VARCHAR(45) NULL,\n" +
            "  `description` VARCHAR(45) NULL,\n" +
            "  PRIMARY KEY (`id`));";

    private static final String QUERY2 = "CREATE TABLE `katjees04`.`address` (\n" +
            "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
            "  `street` VARCHAR(45) NULL,\n" +
            "  `city` VARCHAR(45) NULL,\n" +
            "  PRIMARY KEY (`id`));";

    private static final String QUERY3 = "CREATE DATABASE `qweqweqwe1` DEFAULT CHARACTER SET utf8 COLLATE utf8_polish_ci ;\n";


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
