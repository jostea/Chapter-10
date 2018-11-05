package HomeWork10_13.Shape.ThreeDemensional;

public class Sphere extends ThreeDimensionalShape {

    private double radius;


    public Sphere(double radius) {
        setRadius(radius);
        setVolume((4 / 3) * (Math.PI * (Math.pow(getRadius(), 3))));
        setArea(Math.PI * (Math.pow(getRadius(), 2)));
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void setVolume(double volume) {
        super.setVolume(volume);
    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    public String toString() {
        return "Radius of Sphere "+getRadius();
    }
}
