package HomeWork10_13.Shape.ThreeDemensional;

public class Tetrahedron extends ThreeDimensionalShape {
    private double a;


    public Tetrahedron(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * (Math.pow(this.a, 2));
    }

    @Override
    public double getVolume() {
        return ((Math.pow(this.a, 3) * Math.sqrt(2)) / 12);
    }

    @Override
    public String toString() {
        return "Tetrahedron";
    }
}
