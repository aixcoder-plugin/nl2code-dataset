package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Evaluation133 extends AbstractBaseEvaluation {
    public Evaluation133(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        String expected_date = String.format("%4d-%02d-01 00:00:00", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1);
        int pass_count = 0;
        int total_count = 1;

        try {
            if (strToDateLong(expected_date).getTime() == solution.currentMonthStartUnixTime()) {
                pass_count++;
            }
        } catch (Exception e) {
        }
        return new int[]{pass_count, total_count};
    }

    public static Date strToDateLong(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

}
