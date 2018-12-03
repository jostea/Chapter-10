package HomeWork10_13.Shape.TwoDemensional;

public class Square extends TwoDimensionallyShape {

    private double length;

    public Square(double length) {
        this.length = length;

    }

    public String toString() {
        return "Square";
    }

    @Override
    public double getArea() {
        return Math.pow((this.length), 2);
    }
}
