package com.hspedu.Override_;

public class OverrideExcerise01 {
    public static void main(String[] args) {
       Person jack = new Person("jack", 10);
        System.out.println(jack.say());
        Student smith = new Student("smith", 20, 12345, 99.8);
        System.out.println(smith.say());
    }
}
