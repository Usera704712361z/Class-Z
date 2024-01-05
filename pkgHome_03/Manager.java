package com.hspedu.pkgHome_03;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, int days, double grade) {
        super(name, salary, days, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void showSalary() {
        System.out.println("manager " + getName() + " 給料 = " + (bonus + getDays() * getSalary() * getGrade()));
    }
}
