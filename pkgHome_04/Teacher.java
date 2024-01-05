package com.hspedu.pkgHome_04;

public class Teacher extends Employee {
    private int classDay;
    private double classSal;

    public Teacher(String name, double sal) {
        super(name, sal);
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public void printSal() {
        System.out.print("先生の給料 ");
        System.out.println(getName() + " 年給 = " + (getSal() * getSalMonth() + getClassSal() * getClassDay()));
    }
}
