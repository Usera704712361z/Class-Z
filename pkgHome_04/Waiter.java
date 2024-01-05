package com.hspedu.pkgHome_04;

public class Waiter extends Employee {
    public Waiter(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void printSal() {
        System.out.print("ウェイターの給料 ");
        super.printSal();
    }
}
