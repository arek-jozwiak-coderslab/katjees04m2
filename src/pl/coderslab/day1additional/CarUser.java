package pl.coderslab.day1additional;

public class CarUser {

    private String firstName;
    private String lastName = "no name";
    private static int age;


    public static void describeStatic() {

        System.out.println("describe static:" + age);
    }

    private String doSth(String str) {
        return str.toUpperCase() + " ooo ";
    }

    public void describeUser(String firstName) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Some info about user: ")
                .append("firstName: ")
                .append(firstName + " - " + this.firstName)
                .append(" lastName: ")
                .append(doSth(lastName));

        System.out.println(stringBuilder.toString());
    }

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

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
}
