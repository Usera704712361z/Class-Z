package com.hspedu.collection_.Iterator_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1 ));
        col.add(new Book("小李飞刀", "古龙", 5.1 ));
        col.add(new Book("红楼梦", "曹雪芹", 34.6 ));

        //System.out.println(col);
        Iterator iterator = col.iterator();
        while(iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        //使用增强for
        System.out.println("===增强for===");
        for(Object book : col) {
            System.out.println(book);
        }
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
