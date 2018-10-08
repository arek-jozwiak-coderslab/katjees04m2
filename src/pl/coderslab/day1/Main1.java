package pl.coderslab.day1;

public class Main1 {

    public static void main(String[] args) {

        AccessModifier accessModifier = new AccessModifier();
        System.out.println(accessModifier.protectedAttribute);

        Cat cat = new Cat();
        Dog dog = new Dog();

        String s1 = "aaa";
        String s2 = "aaa";
        String s3 = "bbb";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

    }
}
