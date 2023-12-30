package com.hspedu.encap;

public class TestAccount {
    public static void main(String[] args) {
        Account a = new Account();
        a.setName("jack");
        a.setBalance(100);
        a.setPwd("123456");
        a.showInfo();
    }
}
