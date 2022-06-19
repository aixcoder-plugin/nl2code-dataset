package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class AixcoderOld125 extends GenerateMethodBase {
    public int getDaysByMonth(String dateTime) throws ParseException {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(dateTime));
        return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
