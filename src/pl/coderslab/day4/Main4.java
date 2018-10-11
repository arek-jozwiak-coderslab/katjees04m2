package pl.coderslab.day4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Main4 {
    private static final String QUERY_SELECT = "select * from orders \n" +
            "  join products_orders po on orders.id = po.orders_id\n" +
            "  join products p on po.products_id = p.id order  by orders.id";

    public static void main(String[] args) {
        try (Connection conn = DbUtil.getConnection("products_ex");
             PreparedStatement stat = conn.prepareStatement(QUERY_SELECT);
             ResultSet rs = stat.executeQuery()) {

            int currentOrder = 0;
            while (rs.next()) {
                int product_id = rs.getInt("products_id");
                int order_id = rs.getInt("orders_id");

                if (currentOrder != order_id) {
                    System.out.println("Zamówienie o id :" + order_id );
                }

                currentOrder = order_id;
                System.out.println("  * Produkt o id   " + product_id);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
