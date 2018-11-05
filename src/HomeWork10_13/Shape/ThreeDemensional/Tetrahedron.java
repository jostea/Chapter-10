package HomeWork10_13.Shape.ThreeDemensional;

public class Tetrahedron extends ThreeDimensionalShape {
    private double a;


    public Tetrahedron(double a) {
        setA(a);
        setVolume((Math.pow(getA(), 3) * Math.sqrt(2)) / 12);
        setArea(Math.sqrt(3) * (Math.pow(getA(), 2)));
    }

    @Override
    public void setArea(double area) {
        super.setArea(area);
    }

    @Override
    public void setVolume(double volume) {
        super.setVolume(volume);
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public String toString() {
        return "Side of Tetrahedron " + getA();
    }
}
