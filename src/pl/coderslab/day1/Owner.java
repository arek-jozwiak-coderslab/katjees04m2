package pl.coderslab.day1;

import pl.coderslab.day1additional.Car;

public class Owner {

    private String firstName;
    private String lastName = "no name";
    private static int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Owner.age = age;
    }
}
