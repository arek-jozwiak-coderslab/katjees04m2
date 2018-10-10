package pl.coderslab.day2;

public class Product {
    private long id;
    private String name;
    private double price;
    private static long nextId = 1; // od 1 se zacznijmy

    public Product(String name) {
        this.name = name;
        // unikalne ID
        this.id = nextId;
        nextId++;
    }

    public void setPrice(double price) {
        if (price < 0.01) {
            throw new IllegalArgumentException("Zbyt mała cena.");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public long getId() {
        return id;
    }
}