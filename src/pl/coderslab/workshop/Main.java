package pl.coderslab.workshop;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        BookDao bookDao = new BookDao();
        //create book
        Book book = new Book();
        book.setTitle("Thinking in Java");
        book.setAuthor("Bruce Eckel");
        bookDao.create(book);

        // read and update book
        Book read = bookDao.read(1);
        read.setTitle("Java 2 podstawy");
        read.setIsbn("123321");
        bookDao.update(read);

        //read and remove book
        Book read1 = bookDao.read(2);
        bookDao.delete(read1.getId());

        // get list

        Book[] books = bookDao.findAll();
        for (Book book1 : books) {
            System.out.println(book1);
        }


    }
}
