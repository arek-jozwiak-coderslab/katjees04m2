package pl.coderslab.day1additional;

public class Car  extends Vehicle implements Movable{

    public boolean combi;

    public void runCar(){
        System.out.println("running: " + model);
    }

    @Override
    public void run() {
        System.out.println("run");
    }
}
