package com.hspedu.wrapper_.testwork_.Work02;

public class TestWork02 {
    public static void main(String[] args) {
        String name = "jack";
        String pwd = "123456";
        String email = "jack@sohu.com";
        try {
            userRegister(name, pwd, email);
            System.out.println("おめでとうございます、登録が完了しました……");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void userRegister(String name, String pwd, String email) {
        if(!(name != null && pwd != null && email != null)) {
            throw new RuntimeException("パラメータはnullであってはなりません");
        }
        int userLength = name.length();
        if(!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("ユーザー名は2、3、または4文字でなければなりません");
        }

        if(!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("パスワードは6桁で、数字のみでなければなりません");
        }

        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if(!(i > 0 && j > i)) {
            throw new RuntimeException("メールアドレスには @ と . が含まれ、@ が . の前にある必要があります");
        }
    }
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
