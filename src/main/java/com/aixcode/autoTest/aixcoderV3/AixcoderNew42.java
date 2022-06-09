package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AixcoderNew42 extends GenerateMethodBase {
    public String getLastYearDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -1);
        return new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
    }
}
