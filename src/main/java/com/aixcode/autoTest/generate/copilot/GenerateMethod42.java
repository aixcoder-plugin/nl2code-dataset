package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod42 extends GenerateMethodBase {
    /**
     * 得到距离当前时间前一年的时间
     */
    public String getLastYearDate() {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.add(java.util.Calendar.YEAR, -1);
        return new java.text.SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
    }

}
