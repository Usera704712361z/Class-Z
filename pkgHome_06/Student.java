package com.hspedu.pkgHome_06;

public class Student extends Person {
    private String stu_id;

    public Student(String name, char gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String play() {
        return super.play() + "サッカーです。";
    }

    public void study() {
        System.out.println(getName() + "：私は約束します、一生懸命に勉強します。");
    }

    public void printInfo() {
        System.out.println("学生のメセージ：");
        System.out.println(super.basicInfo());
        System.out.println("学籍番号：" + stu_id);
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}' + super.toString();
    }
}
