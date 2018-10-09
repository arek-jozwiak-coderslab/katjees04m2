package pl.coderslab.day2;

public class Shape {
    private double x;
    private double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Shape shape) {
        double resultx = Math.pow(shape.x - this.x, 2);
        double resulty = Math.pow(shape.y - this.y, 2);
        return Math.sqrt(resultx + resulty);
    }


}
