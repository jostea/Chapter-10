package HomeWork10_13.Shape.ThreeDemensional;

import HomeWork10_13.Shape.Shape;

public abstract class ThreeDimensionalShape extends Shape {


    public abstract double getVolume();


    @Override
    public String toString() {
        return "Area " + getArea() + "\nVolume " + getVolume();
    }
}
