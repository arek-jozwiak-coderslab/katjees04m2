package pl.coderslab.day2;

public class Ebook extends Book {

    public int sizeInMB;
    private String fullName;

    @Override
    public void printBook(){
        System.out.println("PRINTING EBOOK");
        super.printBook();
    }

    public void printBook(int a){
        System.out.println("PRINTING EBOOK");
        super.printBook();
    }
    public void printBook(int a, int b){
        System.out.println("PRINTING EBOOK");
        super.printBook();
    }
    public void printBook(String a){
        System.out.println("PRINTING EBOOK");
        super.printBook();
    }

    public Ebook(String firstPartName, String secondPartName){
        this.fullName = firstPartName + " " + secondPartName;
    }

    public Ebook(int sizeInMB){
        this.sizeInMB = sizeInMB;
    }

    public Ebook(){
        super("Book name");
    }
}
