package HomeWork10_13.Shape.TwoDemensional;

public class Circle extends TwoDimensionallyShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public double getArea() {
        return (Math.PI * (Math.pow(radius, 2)));
    }

    public String toString() {
        return "Circle";
    }
}
