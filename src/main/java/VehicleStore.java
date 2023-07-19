import products.Product;
import vehicles.*;
import vehicles.land.Bicycle;
import vehicles.land.Car;
import vehicles.water.Speedboat;
import vehicles.water.Kayak;

import java.util.ArrayList;
import java.util.List;

public class VehicleStore {
    private static List<IVehicle> vehicles;

    public static void main(String[] args) {
        vehicles = new ArrayList<>();
        // create a bike using composition, and call methods from its components
        Bicycle bike1 = new Bicycle(10, 20, new Product("BMX", 350, 6));
        vehicles.add(bike1);

        System.out.println(bike1.getWheelCount());
        System.out.println(bike1.getTitle());
        System.out.println(bike1.getInventory());

        // create a car using composition, and call methods from its multiple components
        Car car1 = new Car(200, 120, new Product("2015 Dacia Duster", 10000, 3),
        new Engine(100, 150));
        vehicles.add(car1);

        car1.startEngine();
        System.out.println(car1.getFuel());
        System.out.println(car1.getPrice());

        // lab tests (water vehicle related)...

        Speedboat speedboat = new Speedboat(100, 120, new Product("Speedy Boat", 1000, 4),
        "pontoon",
        new Motor(100, 120));
        vehicles.add(speedboat);

        speedboat.startEngine();
        System.out.println(speedboat.getFuel());
        System.out.println(speedboat.getHullType());

        Kayak kayak = new Kayak (1, 2, new Product("Not Speedy Boat", 10, 10),
                "pontoon");

        vehicles.add(kayak);
        System.out.println(kayak.getTitle());
        System.out.println(kayak.getPrice());


    }
}
