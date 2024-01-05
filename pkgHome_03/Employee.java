package com.hspedu.pkgHome_03;

public class Employee {
    private String name;
    private double salary;
    private int days;
    private double grade;

    public Employee(String name, double salary, int days, double grade) {
        this.name = name;
        this.salary = salary;
        this.days = days;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void showSalary() {
        System.out.println(name + " 給料 = " + days * salary * grade);;
    }
}
