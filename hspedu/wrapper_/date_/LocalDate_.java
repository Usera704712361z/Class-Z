package com.hspedu.wrapper_.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {
        //LocalDate.now();//LocalTime.now() System.out.println(ldt);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(ldt);
        System.out.println("フォーマットされた日付=" + format);

        System.out.println("年=" + ldt.getYear());
        System.out.println("月=" + ldt.getMonth());
        System.out.println("月=" + ldt.getMonthValue());
        System.out.println("日=" + ldt.getDayOfMonth());
        System.out.println("时=" + ldt.getHour());
        System.out.println("分=" + ldt.getMinute());
        System.out.println("秒=" + ldt.getSecond());

        LocalDate now = LocalDate.now();
        LocalTime now2 = LocalTime.now();

        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println("890 天后=" + dateTimeFormatter.format(localDateTime));

        LocalDateTime localDateTime2 = ldt.minusMinutes(3456);
        System.out.println("3456 分钟前 日期=" + dateTimeFormatter.format(localDateTime2));
    }
}
