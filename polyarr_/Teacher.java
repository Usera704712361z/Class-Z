package com.hspedu.poly_.polyarr_;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String say () {
        return "先生" + super.say() + " salary" + salary;
    }

    public void teach () {
        System.out.println("先生" + getName() + "Javaの授業をしています…");
    }
}
