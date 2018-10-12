package pl.coderslab.workshop;

public class Main {

    public static void main(String[] args) {

        Book b = new Book();
        b.setAuthor("Bruce Eckel");
        b.setTitle("Thinking in Java");
        BookDao bookDao = new BookDao();
        bookDao.create(b);

    }
}
