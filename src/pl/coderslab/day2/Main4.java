package pl.coderslab.day2;

public class Main4 {

    public static void main(String[] args) {

        Book book = new Book();
        try {
            Book book3 = (Book) book.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        book.increaseNumber();
        Book book2 = new Book();
        book2.increaseNumber();
        System.out.println(Book.number);

        book.printNames("Arek", "Marek", "Dare", "Czarek", "Jarek");

        int a = 12;
        int b = 4;
        Integer integer = new Integer(3);

        Integer[] integers = new Integer[3];

        integers[0] = a;
        integers[1] = b;
        integers[2] = integer;


        int[] ints = new int[3];
        ints[0] = a;
        ints[1] = b;
        ints[2] = integer;

        int r = 3;
        double some = 4.0 / 3 * Math.PI * r * r * r;


        System.out.println(4d / 3);
        System.out.println(4.0 / 3);

        int number = 123;
        String a1 = Integer.toString(number);
        String a2 = "" + number;

        Book book1 = new Book();

    }
}
