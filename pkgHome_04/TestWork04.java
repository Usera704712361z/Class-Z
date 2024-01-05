package com.hspedu.pkgHome_04;

public class TestWork04 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 3000);
        jack.printSal();

        Peasant tom = new Peasant("tom", 5000);
        tom.printSal();

        Waiter jerry = new Waiter("jerry", 2000);
        jerry.printSal();

        Teacher mary = new Teacher("mary", 1000);
        mary.setSalMonth(15);
        mary.setClassSal(50);
        mary.setClassDay(300);
        mary.printSal();

        Scientist blade = new Scientist("blade", 8000);
        blade.setBonus(100000);
        blade.printSal();
    }
}
