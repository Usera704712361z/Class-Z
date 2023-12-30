package com.hspedu.extend_;

public class Pc extends Computer {
    private String brand;
    public Pc(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo() {
        System.out.println("Pc 情報 = ");
        System.out.println(getDetail() + " brand = " + brand);
    }
}
