package com.hspedu.collection_.Test_.Test02_;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02_ {
    public static void main(String[] args) {
        Car car = new Car("バイマー", 400000);
        Car car2 = new Car("ベントレー", 5000000);
        ArrayList arrayList = new ArrayList();
        arrayList.add(car);
        arrayList.add(car2);
        System.out.println(arrayList);

        System.out.println("==========");
        arrayList.remove(car);
        System.out.println(arrayList);

        System.out.println("==========");
        System.out.println(arrayList.contains(car));

        System.out.println("==========");
        System.out.println(arrayList.size());

        System.out.println("==========");
        System.out.println(arrayList.isEmpty());

        System.out.println("==========");
        arrayList.clear();
        System.out.println(arrayList);

        System.out.println("==========");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(car);
        arrayList2.add(car2);
        arrayList.addAll(arrayList2);
        System.out.println(arrayList);

        System.out.println("==========");
        System.out.println(arrayList.containsAll(arrayList2));

        System.out.println("==========");
        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);

        arrayList.add(car);
        arrayList.add(car2);
        System.out.println("=====增强for循環=====");
        for (Object o :arrayList) {
            System.out.println(o);
        }
        System.out.println("=====迭代器=====");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
