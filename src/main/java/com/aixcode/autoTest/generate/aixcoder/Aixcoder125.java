package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Aixcoder125 extends GenerateMethodBase {
    public int getDaysByMonth(String dateTim) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        Date date;

        try {
            date = simpleDateFormat.parse(dateTim);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return 0;
    }

}
