package com.hspedu.pkgHome_04;

public class Peasant extends Employee {
    public Peasant(String name, double sal) {
        super(name, sal);
    }

    public void printSal() {
        System.out.print("農民の給料 ");
        super.printSal();
    }
}
