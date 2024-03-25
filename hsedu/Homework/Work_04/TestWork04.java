package com.hsedu.Homework.Work_04;

public class TestWork04 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}

class A {
    private String NAME = "a";
    public void f1() {
        class B {
            private final String NAME= "b";
            public void show() {
                System.out.println("NAME = " + NAME + " AのNAME = " + A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}