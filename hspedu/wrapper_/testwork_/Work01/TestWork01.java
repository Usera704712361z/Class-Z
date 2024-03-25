package com.hspedu.wrapper_.testwork_.Work01;

public class TestWork01 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println("====交換前====");
        System.out.println(str);
        System.out.println("====交換後====");
        try {
            str = reverse(str, 1, 41);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(str);

    }
    public static String reverse(String str, int start, int end) {
        if(!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("パラメータが正しくありません");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';
        for(int i = start, j = end; i < j;  i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
