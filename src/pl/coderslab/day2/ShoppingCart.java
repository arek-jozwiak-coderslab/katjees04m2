package pl.coderslab.day2;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCart {
    private CartItem[] cartItems = new CartItem[0]; // bez konstruktora bo tylko to potrzebuje zainicjowac

    public void addProduct(Product product, int quantity) {
        for (CartItem el : cartItems) // sprawdze czy jest on juz w naszej tablicy produktów
        {
            if (el.getProduct().getId() == product.getId()) // jesli jest (czyli id sa takie same)
            {
                el.addToQuantity(quantity);// to na JUZ DODANYM produkcie(CartItem) zwiekszam jego ILOSC
                return; // wypad bo produkt juz byl i zwiekszylem tylko jego ilosc
            }
        }

        // to wykonuje jak nie mamy jeszcze tego produktu
        CartItem cartItem = new CartItem(product, quantity); // tworzymy produkcik
        this.cartItems = Arrays.copyOf(this.cartItems, this.cartItems.length + 1); // zwiekszam tab o 1
        this.cartItems[this.cartItems.length - 1] = cartItem; // i dodaje nowy produkt
    }

    public void printReceipt() {
        int i = 0;
        StringBuilder sb = new StringBuilder();

        sb.append("---------------------------------------------\n");
        for (CartItem el : this.cartItems) // dla kazdego itemka w koszyku
        {
            sb.append((++i) + ": "); // lp.
            sb.append(el.getProduct().getName()); // nazwa produktu
            sb.append(" [" + el.getProduct().getId() + "], "); // [id]
            sb.append(el.getQuantity() + "x" + el.getProduct().getPrice()); // ilosc x cena
            double sum = ((double) el.getQuantity()) * (el.getProduct().getPrice());
            sum = Main3.round2(sum);
            sb.append(" = " + sum + " zł\n"); // = suma
        }
        sb.append("---------------------------------------------\n").append("Razem: ").append(this.getTotalSum()).append(" zł");
        sb.append(" | Produktów: " + getTotalQuantity());

        System.out.println(sb.toString()); // wyswietlamy paragon na koncu
    }

    public void removeProduct(Product product) {
        for (int i = 0; i < cartItems.length; i++) // sprawdze kazdy item w koszyku
        {
            if (cartItems[i].getProduct().getId() == product.getId()) // jesli znalazlem taki item...
            {
                ArrayList<CartItem> cartItemsList = new ArrayList<>(Arrays.asList(cartItems)); // zmien na liste
                cartItemsList.remove(i); // usun el o danym indeksie
                this.cartItems = new CartItem[cartItemsList.size()]; // nowa tablica...
                this.cartItems = cartItemsList.toArray(this.cartItems); // liste zmien na tablice itemkow
                break; // konczymy bo juz usuniety
            }
        }
    }

    public void updateProduct(Product product, int quantity) {
        for (CartItem el : this.cartItems) // dla kazdego itemka w koszyku
        {
            if (el.getProduct().getId() == product.getId()) // jesli jest (czyli id sa takie same)
            {
                el.setQuantity(quantity); // to ustawiamy nowa ilosc
            }
        }
    }

    public int getTotalQuantity() {
        int total = 0;
        for (CartItem el : this.cartItems) {
            total += el.getQuantity();
        }
        return total;
    }

    public double getTotalSum() {
        double total = 0.0;
        for (CartItem el : this.cartItems) {
            total += Main3.round2(el.getProduct().getPrice() * ((double) el.getQuantity()));
        }
        return Main3.round2(total);
    }
}