package HomeWork10_17;

public class Building implements CarbonFootprint {
    private String Build = "Buildings";

    public String getBuild() {
        return Build;
    }

    @Override
    public String toString() {
        return getBuild();
    }

    @Override
    public String getCarbonFootPrint() {
        return "For one winter in the world " + toString() + " use million tones of coal or fuel!";
    }
}
