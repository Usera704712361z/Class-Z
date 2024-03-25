package com.hspedu.wrapper_.stringBuffer_;

public class StringBufferExercise {
    public static void main (String[] args) {
        String price = "123456.99";
        StringBuffer str = new StringBuffer(price);
        for(int i = str.lastIndexOf(".") - 3; i > 0; i -= 3) {
            str.insert(i,",");
        }
        System.out.println(str);
    }
}