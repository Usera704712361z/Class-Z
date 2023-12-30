package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName ("jack");
        account.setBalance(300);
        account.setPwd("123456");
        account.showInfo();
    }
}
