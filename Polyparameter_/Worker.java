package com.hspedu.poly_.Polyparameter_;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work () {
        System.out.println("一般社員" + getName() + " is working");
    }

    public double getAnnual () {
        return super.getAnnual();
    }
}
