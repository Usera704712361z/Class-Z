package com.hspedu.pkgHome_02;

public class AssociateProfessor extends Teacher {
    public AssociateProfessor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    public void introduce () {
        System.out.println("====助教授の情報====");
        super.introduce();
    }
}
