package com.hspedu.wrapper_.string_;

public class StringMethod {
    public static void main(String[] args) {
        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        // 1. 以 , 为标准对 poem 进行分割 , 返回一个数组
        // 2. 在对字符串进行分割时，如果有特殊字符，需要加入 转义符 \
        String[] split = poem.split(",");
        poem = "E:\\aaa\\bbb";
        split = poem.split("\\\\");
        System.out.println("===分割後の内容===");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        String name = "john";
        int age = 10;
        double score = 56.857;
        char gender = '男';
        String formatStr = "私の名前は%s、年齢は%d、成績は%.2f、性別は%cです。みなさんに喜んでいただけると嬉しいです！";
        String info2 = String.format(formatStr, name, age, score, gender);
        System.out.println("info2=" + info2);
    }
}
