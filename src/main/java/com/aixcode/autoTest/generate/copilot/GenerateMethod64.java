package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod64 extends GenerateMethodBase {
    /**
     * 得到现在时间
     */
    public String getStringToday(String format)
    {
        java.util.Date today = new java.util.Date();
        java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(format);
        String dateString = formatter.format(today);
        return dateString;
    }

}
