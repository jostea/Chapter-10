package HomeWork10_13.Shape.ThreeDemensional;

import HomeWork10_13.Shape.Shape;

public class ThreeDimensionalShape extends Shape {
    private double area;
    private double volume;



    public void setArea(double area) {
        this.area = area;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }


    @Override
    public String toString() {
        return "Area "+getArea()+"\nVolume "+getVolume();
    }
}
