package HomeWork10_13.Shape.TwoDemensional;

public class Circle extends TwoDemensionalShape {

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
        setArea(Math.PI * (Math.pow(getRadius(), 2)));

    }

    public void setRadius(double radius) {

        if (radius < 0)
            throw new IllegalArgumentException("Radius can not be negative!");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public void setArea(double area) {
        super.setArea(area);
    }


    public String toString() {
        return  "Radius of Circle " + getRadius();
    }
}
