package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Calendar;
import java.util.Date;

public class AixcoderAuto45 extends GenerateMethodBase {
    /**
     * 获取某个时间data的年份
     */
    public int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }
}
