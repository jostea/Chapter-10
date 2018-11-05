package HomeWork10_13.Shape.TwoDemensional;

import HomeWork10_13.Shape.Shape;

public class TwoDemensionalShape extends Shape {

    private double area;


    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }


    @Override
    public String toString() {
        return "Area " + getArea();
    }
}
