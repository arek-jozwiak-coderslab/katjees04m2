package pl.coderslab.day1additional;

public class Vehicle {

    public String name;
    public String model;

    private CarUser carUser;

    public CarUser getCarUser() {
        return carUser;
    }

    public void setCarUser(CarUser carUser) {
        this.carUser = carUser;
    }

    public void runCar(){
        System.out.println("running: " + model);
    }
}
