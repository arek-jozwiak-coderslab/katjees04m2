package pl.coderslab.day1additional;

public class MotorBike implements Movable {

    public static String name;
    public String model;
    private boolean needCard;
    private CarUser carUser;

    public int wheels = 2;

    public CarUser getCarUser() {
        return carUser;
    }

    public void setCarUser(CarUser carUser) {
        this.carUser = carUser;
    }

    public void runCar() {
        System.out.println("running: " + model);
    }

    @Override
    public void run() {

    }
}
