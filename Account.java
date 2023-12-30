package com.hspedu.encap;

public class Account {
    private String name;
    private double balance;
    private String pwd;

    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.name = name;
        this.balance = balance;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("名前の要件は（2桁、3桁、または4桁の長さである）デフォルト値は '無名' です");
            this.name = "無名";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("残高（20以上必要）、デフォルト値は0です");
            this.balance = 0;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("パスワード（6桁必須）、デフォルトのパスワードは000000です");
            this.pwd ="000000";
        }
    }

    public void showInfo () {
        System.out.println("アカウント情報 name = " + name + " 残高 = " + balance + " パスワード = " + pwd);
    }
}
