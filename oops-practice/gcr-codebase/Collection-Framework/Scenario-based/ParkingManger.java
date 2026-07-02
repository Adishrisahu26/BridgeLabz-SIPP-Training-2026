import java.util.*;

public class ParkingManager {
    public static void main(String[] args) {

        ArrayList<String> vehicles = new ArrayList<>();

        vehicles.add("UP32AB1234");
        vehicles.add("DL10CD5678");

        vehicles.remove("DL10CD5678");

        String search="UP32AB1234";

        if(vehicles.contains(search))
            System.out.println("Vehicle Found");
        else
            System.out.println("Not Found");

        System.out.println("Parked Vehicles:");
        for(String v:vehicles)
            System.out.println(v);

        System.out.println("Occupied Slots = "+vehicles.size());
    }
}