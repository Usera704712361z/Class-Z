package com.hspedu.pkgHome_02;

public class Lecturer extends Teacher {
    public Lecturer(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    public void introduce () {
        System.out.println("講師の情報");
        super.introduce();
    }
}
