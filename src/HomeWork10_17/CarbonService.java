package HomeWork10_17;

import java.util.ArrayList;
import java.util.List;

public class CarbonService {

    public static void main(String[] args) {
        Building building = new Building();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();


        ArrayList<CarbonFootprint> list = new ArrayList<>();
        list.add(car);
        list.add(building);
        list.add(bicycle);


        for (CarbonFootprint i:list) {
            System.out.println(i.getCarbonFootPrint());
        }
    }

}
