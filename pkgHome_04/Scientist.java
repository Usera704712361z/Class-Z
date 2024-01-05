package com.hspedu.pkgHome_04;

public class Scientist extends Employee {
    private double bonus;

    public Scientist(String name, double sal) {
        super(name, sal);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void printSal() {
        System.out.print("科学家の給料 ");
        System.out.println(getName() + " 年給 = " + (getSal() * getSalMonth() + getBonus()));
    }
}
