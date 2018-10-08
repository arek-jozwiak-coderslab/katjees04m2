package pl.coderslab.day1additional;

public class Main {

    public static void main(String[] args) {

        Car arekCar = new Car();
        Car secondarekCar = new Car();

        arekCar.model = "VW";
        arekCar.combi = true;
        secondarekCar.model = "Porsche";
        secondarekCar.combi = false;

        System.out.println(arekCar.model);


        CarUser carUser = new CarUser();
        carUser.setFirstName("Arek");
        carUser.setLastName("Jozwiak");

        arekCar.setCarUser(carUser);


        arekCar.runCar();
        secondarekCar.runCar();

        String s = new String("arek");
        String s2 = "arek";
    }
}
