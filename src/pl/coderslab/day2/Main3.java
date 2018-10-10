package pl.coderslab.day2;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
    static double round2(double number) {
        number = Math.round(number * 100);
        number = number / 100;
        return number;
    }

    static Product[] generateProducts(int amount) {
        Product[] products = new Product[amount];
        Random generator = new Random();
        System.out.println("|  Nazwa  |    Cena   | ID  |");
        System.out.println("+~~~~~~~~~+~~~~~~~~~~~+~~~~~+");
        for (int i = 0; i < products.length; i++) // generuje se 100 produktow ktore beda w sklepie
        {
            products[i] = new Product("Product " + (i + 1));
            double generatedPrice = (double) (generator.nextInt(10000)) / 100.0 + 0.01; // losuje od 1 do 10000, dziele na 100 , czyli mam od +0.01 - 100.00 (z przecinkami lacznie)

            generatedPrice = round2(generatedPrice);

            products[i].setPrice(generatedPrice);
            System.out.println(" " + products[i].getName() + "   " + products[i].getPrice() + " zł    [" + products[i].getId() + "]");
        }
        return products;
    }

    public static Product getProductById(Product[] products, int id) {
        for (Product el : products) {
            if (el.getId() == id) {
                return el;
            }
        }
        throw new NoSuchElementException("Nie ma produktu o tym ID.");
    }

    public static void main(String[] args) {
        Product[] products = generateProducts(20); // tworzymy produkty do testow

        ShoppingCart myCart = new ShoppingCart(); // obiekt mojego koszyka

        while (true) {
            System.out.print(("Podaj ID produktu i ilość (np. 11 2): "));
            Scanner scan = new Scanner(System.in);

            String line = scan.nextLine();

            if (line.trim().equals("quit")) {
                break; // wychodzimy jesli quit
            }

            int productId = Integer.parseInt(line.split(" ")[0]);
            int productQuantity = Integer.parseInt(line.split(" ")[1]);

            Product currentProduct = getProductById(products, productId);


            myCart.addProduct(currentProduct, productQuantity);
        }
        myCart.removeProduct(getProductById(products, 3)); // test - usuwamy produkt o ID 3 (bo go niechcemy juz w koszyku)
        myCart.printReceipt(); // drukuje paragon
    }
}