package com.hspedu.pkgHome_05;

public class TestWork05 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack", 20, "nurse", 'M', 2000);
        Doctor doctor2 = new Doctor("jack", 20, "nurse", 'M', 2000);
        System.out.println(doctor1.equals(doctor2));
    }
}
