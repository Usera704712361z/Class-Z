package com.hspedu.collection_.HashMap_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("01", new Employee("jack", 10000, "01"));
        hashMap.put("02", new Employee("tom", 20000, "02"));
        hashMap.put("03", new Employee("smith", 30000, "03"));

        Set keySet = hashMap.keySet();
        System.out.println("====增强for===");
        for (Object key : keySet) {
            Employee emp = (Employee) hashMap.get(key);
            if(emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }
        Set entrySet = hashMap.entrySet();
        System.out.println("====迭代器====");
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Employee emp = (Employee) entry.getValue();
            if(emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }
    }
}

class Employee {
    private String name;
    private double sal;
    private String id;

    public Employee(String name, double sal, String id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id='" + id + '\'' +
                '}';
    }
}
