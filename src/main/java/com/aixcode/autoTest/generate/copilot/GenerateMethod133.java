package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Calendar;

public class GenerateMethod133 extends GenerateMethodBase {
    /**
     *   返回当月开始时间
     */
    public long currentMonthStartUnixTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        System.out.println(cal.getTime());
        return cal.getTimeInMillis();
    }

}
