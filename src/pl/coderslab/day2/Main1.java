package pl.coderslab.day2;

import pl.coderslab.day1.AccessModifier;

public class Main1 {

    public static void main(String[] args) {

        Ebook ebook = new Ebook();
        ebook.printBook();

        Shape shape1 = new Shape(2, 4);
        Shape shape2 = new Shape(2, 8);

        System.out.println(shape2.getDistance(shape1));


    }
}
