package pl.coderslab.day4;

public class Main3 {

    String QUERY = "select * from payments WHERE payment_date < DATE_SUB(CURRENT_DATE(), INTERVAL 4 DAY);";
    //ALTER TABLE tickets ADD priceUSD decimal(9,2) NULL;
    //ALTER TABLE movies ADD director char(80) NULL;
}
