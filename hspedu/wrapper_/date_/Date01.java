package com.hspedu.wrapper_.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println(d1);
        Date d2 = new Date(9234567);
        System.out.println(d2);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        System.out.println(sdf.format(d1));

        String s = "1990年01月01日 10:20:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println(parse);
    }
}
