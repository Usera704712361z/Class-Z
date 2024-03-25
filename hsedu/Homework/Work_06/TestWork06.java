package com.hsedu.Homework.Work_06;

public class TestWork06 {
    public static void main(String[] args) {
        Car car = new Car(60);
        car.getAir().flow();
        Car car1 = new Car(-1);
        car1.getAir().flow();
        Car car2 = new Car(20);
        car2.getAir().flow();
    }
}

class Car {
    private double temperature;
    public Car(double temperature) {
        this.temperature = temperature;
    }
    class Air {
        public void flow() {
            if(temperature > 40) {
                System.out.println("温度が40度以上です、冷房を開きます");
            } else if (temperature < 0) {
                System.out.println("温度が0度,以下です、暖房を開きます");
            } else {
                System.out.println("温度が正常範囲内で、エアコンが閉まります");
            }
        }
    }
    public Air getAir() {
        return new Air();
    }
}
