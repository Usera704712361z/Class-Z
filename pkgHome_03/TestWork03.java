package com.hspedu.pkgHome_03;

public class TestWork03 {
    public static void main(String[] args) {
        Manager manager = new Manager("scott", 300, 30, 1.2);
        Worker worker = new Worker("jack", 100, 30, 1.0);
        manager.setBonus(1000);
        manager.showSalary();
        worker.showSalary();
    }
}
