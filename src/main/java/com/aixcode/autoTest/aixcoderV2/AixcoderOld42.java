package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Calendar;

public class AixcoderOld42 extends GenerateMethodBase {
    public String getLastYearDate() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year + "年前";
    }
}
