package HomeWork10_17;

public class Car implements CarbonFootprint {

    private String car = "Car";

    public String getCar() {
        return car;
    }


    @Override
    public String toString() {
        return getCar();
    }

    @Override
    public String getCarbonFootPrint() {
        return toString()+"s burn 100 liters of fuel per month in the middle! ";
    }
}
