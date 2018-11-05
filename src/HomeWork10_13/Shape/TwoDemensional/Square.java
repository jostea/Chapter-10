package HomeWork10_13.Shape.TwoDemensional;

public class Square extends TwoDemensionalShape {

    private double length;

    public Square(double length) {
        setLength(length);
        setArea(Math.pow(getLength(), 2));

    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public void setArea(double area) {
        super.setArea(area);
    }



    public String toString() {
        return "Length of square:" + getLength();
    }
}
