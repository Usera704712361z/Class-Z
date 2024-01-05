package com.hspedu.pkgHome_04;

public class Worker extends Employee {
    public Worker(String name, double sal) {
        super(name, sal);
    }

    public void printSal() {
        System.out.print("労働者の給料 ");
        super.printSal();
    }
}
