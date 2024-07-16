package com.hspedu_15.generic_.improve_.GenericExercise_;

import java.util.*;
@SuppressWarnings({"all"})
public class GenericExercise_ {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<Student>();
        students.add(new Student("john", 12));
        students.add(new Student("tom", 13));
        students.add(new Student("mary", 14));
        for (Student student :students) {
            System.out.println(student);
        }

        HashMap<String, Student> hm = new HashMap<String, Student>();
        hm.put("milan", new Student("milan", 15));
        hm.put("smith", new Student("smith", 16));
        hm.put("jerry", new Student("jerry", 17));
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }
    }
}

class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
