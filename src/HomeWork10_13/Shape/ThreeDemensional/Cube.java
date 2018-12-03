package HomeWork10_13.Shape.ThreeDemensional;

public class Cube extends ThreeDimensionalShape {

    private double a;

    public Cube(double a) {
        this.a = a;
    }


    @Override
    public double getVolume() {
        return getArea() * a;
    }

    @Override
    public String toString() {
        return "Cube";
    }

    @Override
    public double getArea() {
        return a * a;
    }
}
