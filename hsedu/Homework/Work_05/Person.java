package com.hsedu.Homework.Work_05;

public class Person {
    private String name;
    private static Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        if(!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }

    public void common() {
        if(!(vehicles instanceof Horse)) {
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }

    public void passMountain() {
        if(!(vehicles instanceof Plane)) {
            vehicles = VehiclesFactory.getPlane();
        }
        vehicles.work();
    }
}
