package com.hspedu.wrapper_.date_;

import java.time.Instant;
import java.util.Date;

public class Instant_ {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        Date date = Date.from(now);
        System.out.println(date);
        Instant instant = date.toInstant();
    }
}
