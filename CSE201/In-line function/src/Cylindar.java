public class Cylindar extends Figure {
    private double height;

    Cylindar(double newRadius, double newHeight) {
        setRadius(newRadius);
        height = newHeight;;
    }
    public double CylinderVolume() {
        return circleArea() * height;
    }
}
