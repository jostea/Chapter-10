package HomeWork10_13.Shape.ThreeDemensional;

public class Cube extends ThreeDimensionalShape {

    private double a;
    private double b;
    private double c;

    public Cube(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
        setVolume(a * b * c);
        setArea(a * b);

    }

    @Override
    public void setArea(double area) {
        super.setArea(area);
    }

    @Override
    public void setVolume(double volume) {
        super.setVolume(volume);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }


    @Override
    public String toString() {
        return
                "Side 1 of Cube " + getA() +
                        "\nSide 2 of Cube " + getB() +
                        "\nSide 3 of Cube " + getC();
    }
}
