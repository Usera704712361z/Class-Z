package com.hspedu.pkgHome_06;

public class Teacher extends Person {
    private int work_age;

    public Teacher(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public String play() {
        return super.play() + "将棋です。";
    }

    public void teach() {
        System.out.println(getName() + "：私は約束します、真剣に教育を行います。");
    }

    public void printInfo() {
        System.out.println("先生の情報：");
        System.out.println(basicInfo());
        System.out.println("勤務年数：" + work_age);
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }
}
