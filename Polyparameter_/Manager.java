package com.hspedu.poly_.Polyparameter_;

public class Manager extends Employee{
    private double bonus;

    public Manager (String name, double salary, double bonus) {
        super(name, salary);
        this.bonus =bonus;
    }

    public double getBonus () {
        return bonus;
    }

    public void setBonus (double bonus) {
        this.bonus = bonus;
    }

    public void manage () {
        System.out.println("マネージャー " + getName() + " is managing");
    }

    public double getAnnual () {
        return super.getAnnual() + bonus;
    }
}
