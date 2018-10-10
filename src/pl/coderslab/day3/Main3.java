package pl.coderslab.day3;

import java.sql.*;


public class Main3 {


    public static void main(String[] args) {
        String QUERY4 = "SELECT * from products;";

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3366/products_ex?useSSL=false&characterEncoding=utf8",
                "root", "root");
             PreparedStatement stat = conn.prepareStatement(QUERY4);
             ResultSet rs = stat.executeQuery()) {

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                if(description.length()>20){
                    description = description.substring(0, 19) +"...";
                }
                double price = rs.getDouble("price");
                System.out.println(id +" - " + name + " - " + " - " + description +" - "+ price);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
