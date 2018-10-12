package pl.coderslab.workshop;

public class Main2 {

    public static void main(String[] args) {
        int productId = 1;
        ProductDao productDao = new ProductDao();
        Product p = productDao.read(productId);
        System.out.println(p.getPrice() + p.getName());
    }
}
