package HomeWork10_13.Shape.TwoDemensional;

public class Triangle extends TwoDimensionallyShape {

    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double getArea() {
        double p = (this.firstSide + this.secondSide + this.thirdSide) / 2;
        return Math.sqrt(p * (p - firstSide) * (p) - secondSide * (p - thirdSide));
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}
