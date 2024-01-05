package com.hspedu.pkgHome_03;

public class Worker extends Employee{
    public Worker(String name, double salary, int days, double grade) {
        super(name, salary, days, grade);
    }

    public void showSalary() {
        System.out.print("一般社員 ");
        super.showSalary();
    }
}
