package pl.coderslab.day1;

/**
 * For constructor examples
 */
public class Main3 {


    public static void main(String[] args) {
        new Cat(new Owner(), 1l, "Mruczek", 4);

        Owner owner = new Owner();

        Cat cat1 = new Cat();

        cat1.setLegs(3);
        cat1.setName("Puszek");
        cat1.setOwner(owner);
    }
}
