package com.hspedu.pkgHome_01;

public class TestWork {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("smith", 10, "JavaEEEngineer");
        persons[1] = new Person("tom", 50, "BigDateEngineer");
        persons[2] = new Person("mary", 30, "PHPEngineer");

        System.out.println("====元のPerson配列====");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

        Person tmp = null;
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    tmp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = tmp;
                }
            }
        }
        System.out.println("====ソートされたPerson配列====");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }
}
class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}