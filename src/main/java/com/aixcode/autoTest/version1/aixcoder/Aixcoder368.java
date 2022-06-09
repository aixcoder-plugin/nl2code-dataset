package com.aixcode.autoTest.version1.aixcoder;

import java.util.Calendar;
import java.util.Date;

public class Aixcoder368 {
    /**
     * 获取某个时间data的年份
     */
    public static int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }
}
