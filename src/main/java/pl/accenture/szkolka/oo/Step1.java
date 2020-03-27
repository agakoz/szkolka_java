package pl.accenture.szkolka.oo;

import pl.accenture.szkolka.oo.model.*;

public class Step1 {
    public static final Vehicle[] VEHICLE_LIST = {new Car(), new Plane(), new Boat()};
    public static final String COMA_SEPARATOR = ", ";

    public static void main(String[] args) {
        runAllVehicles(VEHICLE_LIST);
        printVehicles(VEHICLE_LIST);
    }


    public static String runAllVehicles(Vehicle[] vehicles) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Vehicle vehicle : vehicles) {
            stringBuilder.append(runVehicle(vehicle));
            if (vehicle != vehicles[vehicles.length - 1])
                stringBuilder.append(COMA_SEPARATOR);
        }
        return stringBuilder.toString().trim();
    }

    public static String runVehicle(Vehicle vehicle) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(vehicle.startEngine()).append(COMA_SEPARATOR);

        if (vehicle instanceof Car) stringBuilder.append(((Car) vehicle).drive());
        else if (vehicle instanceof Boat) stringBuilder.append(((Boat) vehicle).sail());
        else if (vehicle instanceof Plane) stringBuilder.append(((Plane) vehicle).fly());

        return stringBuilder.toString().trim();
    }

    public static void printVehicles(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            printVehicle(vehicle);
            System.out.println("______________");
        }
    }

    public static void printVehicle(Vehicle vehicle) {
        System.out.println(vehicle.startEngine());

        if (vehicle instanceof Car) System.out.println(((Car) vehicle).drive());
        else if (vehicle instanceof Boat) System.out.println(((Boat) vehicle).sail());
        else if (vehicle instanceof Plane) System.out.println(((Plane) vehicle).fly());


    }


}
