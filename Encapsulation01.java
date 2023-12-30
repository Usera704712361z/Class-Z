package com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(30);
        person.setSalary(3000);
        System.out.println(person.info());
        System.out.println(person.getSalary());

        Person smith = new Person("smith", 20, 50000);
        System.out.println("====smithの情報====");
        System.out.println(smith.info());
    }
}
class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名前の長さが適切ではありません。2〜6文字で設定してください。デフォルトの名前は無名となります");
            this.name = "無名";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else  {
            System.out.println("年齢の設定が適切ではありません。1〜120歳の範囲で設定してください。デフォルトの年齢は18歳です");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "情報　name =" + name + " age = " + age + " 給料 = " + salary;
    }
}
