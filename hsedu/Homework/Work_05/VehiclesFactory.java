package com.hsedu.Homework.Work_05;

public class VehiclesFactory {
    private static Horse horse = new Horse();
    private VehiclesFactory() {

    }
    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Plane getPlane() {
        return new Plane();
    }
}
