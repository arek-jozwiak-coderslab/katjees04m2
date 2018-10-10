package pl.coderslab.day2;

public class Book implements Cloneable {

    public String name;
    public double price;
    public String author;

    public static int number = 0;

    public void increaseNumber() {
        Book.number++;
    }

    final void printName() {
        System.out.println("test1");
    }

    public void printBook() {
        System.out.println("PRINTING BOOK");
    }

    public Book(String name) {
        this.name = name;
    }

    public Book() {
        System.out.println("KONSTRUKTOR BOOK !!!!");
    }

    public void printNames(String... names) {
        for (String s : names) {
            System.out.println(s);
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
