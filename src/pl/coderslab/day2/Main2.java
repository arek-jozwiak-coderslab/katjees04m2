package pl.coderslab.day2;

public class Main2 {

    Object newObject = new Ebook();

    public static int aaa(){
        return 2;
    }
    public static void aaa1(){
        System.out.println("asda");
    }


    public static void main(String[] args) {
        aaa1();
        Main2.aaa1();

        Object[] objects = new Object[2];
        objects[0] = new Ebook();

        Ebook ebook = (Ebook) objects[0];

        ebook.printBook();

        Object ebook2 = objects[0];
        ebook2.toString();


    }


}
