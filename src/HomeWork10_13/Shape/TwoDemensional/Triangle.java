package HomeWork10_13.Shape.TwoDemensional;

public class Triangle extends TwoDemensionalShape {

    private double p;
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        setFirstSide(firstSide);
        setSecondSide(secondSide);
        setThirdSide(thirdSide);
        setP();
        setArea(Math.sqrt(getP() * (getP() - getFirstSide()) * (getP() - getSecondSide()) * (getP() - getThirdSide())));

    }

    public void setP() {
        this.p = (getFirstSide() + getSecondSide() + getThirdSide()) / 2;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    @Override
    public void setArea(double area) {
        super.setArea(area);
    }

    public double getP() {
        return p;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }


    public String toString() {
        return "\nSide 1 of triangle " + getFirstSide() +
                "\nSide 2 of triangle " + getSecondSide() +
                "\nSide 3 of triangle " + getThirdSide();
    }
}
