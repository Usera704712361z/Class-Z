package com.hspedu.collection_.HashSet_;

import java.util.HashSet;
import java.util.Objects;

public class HashSetExercise02_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Worker worker1 = new Worker("jack", 1000, new MyDate(1990, 1, 1));
        Worker worker2 = new Worker("tom", 2000, new MyDate(1991, 2, 2));
        Worker worker3 = new Worker("jack", 3000, new MyDate(1990, 1, 1));

        HashSet hashSet = new HashSet();
        hashSet.add(worker1);
        hashSet.add(worker2);
        hashSet.add(worker3);

        for (Object o :hashSet) {
            System.out.println(o);
        }

    }
}

class Worker {
    private String name;
    private double sal;
    private MyDate birthday;

    public Worker(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(name, worker.name) && Objects.equals(birthday, worker.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

//    public MyDate() {
//    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
