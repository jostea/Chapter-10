package HomeWork10_13.Shape.ThreeDemensional;

public class Sphere extends ThreeDimensionalShape {

    private double radius;


    public Sphere(double radius) {
        this.radius = radius;
    }


    @Override
    public double getVolume() {
        return (4 / 3) * (Math.PI * (Math.pow(radius, 3)));
    }

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Sphere";
    }


}
