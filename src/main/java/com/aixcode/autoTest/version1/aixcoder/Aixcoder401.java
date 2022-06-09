package com.aixcode.autoTest.version1.aixcoder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aixcoder401 {
    public static String getStringToday(String format) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        String dateString = formatter.format(currentTime);
        return dateString;
    }
}
