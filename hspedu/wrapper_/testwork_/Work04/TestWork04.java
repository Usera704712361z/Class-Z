package com.hspedu.wrapper_.testwork_.Work04;

public class TestWork04 {
    public static void main(String[] args) {
        String str = "abcHsp U 1234";
        countStr(str);
    }
    public static void countStr(String str) {
        if(str == null) {
            System.out.println("入力は null にできません");
            return;
        }
        int strLen = str.length();
        int numCount = 0;
        int lowerCount = 0;
        int upperCount = 0;
        int otherCount = 0;
        for (int i = 0; i < strLen; i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numCount++;
            } else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCount++;
            } else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upperCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("数字は" + numCount);
        System.out.println("小文字は" + lowerCount);
        System.out.println("大文字は" + upperCount);
        System.out.println("他の文字は" + otherCount);
    }
}
