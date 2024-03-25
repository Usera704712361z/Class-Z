package com.hspedu.enum_;

public class EnumExercise01 {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        System.out.println("=====全ての曜日の情報=====");
        for(Week week:weeks) {
            System.out.println(week);
        }
    }
}

enum Week {
    MONDAY("月曜日"), TUESDAY("火曜日"), WEDNESDAY("水曜日"), THURSDAY("木曜日"),
    FRIDAY("金曜日"), SATURDAY("土曜日"), SUNDAY("日曜日");
    private String name;

    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}