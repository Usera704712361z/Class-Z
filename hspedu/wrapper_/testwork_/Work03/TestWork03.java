package com.hspedu.wrapper_.testwork_.Work03;

public class TestWork03 {
    public static void main(String[] args) {
        String name = "Han shun Ping";
        printName(name);
    }

    public static void printName(String str) {
        if(str == null) {
            System.out.println("str は空であってはなりません");
            return;
        }
        String[]  names = str.split(" ");
        if(names.length != 3) {
            System.out.println("入力された文字列の形式が正しくありません");
            return;
        }
        String format = String.format("%s,%s.%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
