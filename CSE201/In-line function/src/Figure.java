public class Figure {
    final private double pi = 3.14159;
    private double radius;

    public double getPI() {
        return pi;
    }
    public double setRadius(double newRadius) {
        radius = newRadius;
    }
    public double getRadius() {
        return radius;
    }

    final public double circleArea() {
        return pi * radius * radius;
    }
}
