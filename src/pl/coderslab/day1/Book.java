package pl.coderslab.day1;

import java.util.Arrays;

class Book {
    private String name = "Thinking in Java";
    public double price = 95.99;
    public String author = "Bruce Eckel";

    public Author[] authors;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public Book setMame(String name) {
        this.name = name;
        return this;
    }

    public Book setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public void printInfo() {
        String bookInfo = this.author + " " + this.name;
        System.out.println(bookInfo);
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}