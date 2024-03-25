package com.hsedu.Homework.Work_02;

import sun.lwawt.macosx.CSystemTray;

abstract class  Animal {
    public abstract void shout();
}

class Cat extends Animal {
    public void shout() {
        System.out.println("猫が吠える");
    }
}

class Dog extends  Animal {
    public void shout() {
        System.out.println("犬が吠える");
    }
}


