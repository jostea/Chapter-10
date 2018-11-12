package HomeWork10_17;

public class Bicycle implements CarbonFootprint {


    private String bycicle = "Bicycle";

    public String getBicycle() {
        return bycicle;
    }

    @Override
    public String toString() {
        return getBicycle();
    }

    @Override
    public String getCarbonFootPrint() {
        return toString() + " don't use fuel or coal! Let's go riding and be strong";
    }
}
