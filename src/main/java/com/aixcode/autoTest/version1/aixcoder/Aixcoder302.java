package com.aixcode.autoTest.version1.aixcoder;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Aixcoder302 {
    public static Date getMonthLastDay(String dateString) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        Date date = null;

        try {
            date = simpleDateFormat.parse(dateString);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();

        if (date != null) {
            calendar.setTime(date);
        }

        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        return calendar.getTime();
    }
}
