package com.hspedu.collection_.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        System.out.println(list);

        //void add(int index, Collection ele)
        list.add(1, "white");
        System.out.println("=========");
        System.out.println(list);

        //boolean addAll(int index, Collection ele)
        List list2 = new ArrayList();
        list2.add("marry");
        list2.add("john");
        list.addAll(1,list2);
        System.out.println("=========");
        System.out.println(list);

        //Object get(int index)
        System.out.println("=========");
        System.out.println(list);
        System.out.println(list.indexOf("tom"));

        //int lastIndexOf(Object obj)
        System.out.println("=========");
        list.add("jack");
        System.out.println(list);
        System.out.println(list.lastIndexOf("jack"));

        //Object remove(int index)
        System.out.println("=========");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        //Object set(int index, Object ele)
        System.out.println("=========");
        list.set(1, "hello");
        System.out.println(list);

        //List sublist(int fromIndex, int toIndex)
        System.out.println("=========");
        System.out.println(list.subList(1,3));
    }
}
