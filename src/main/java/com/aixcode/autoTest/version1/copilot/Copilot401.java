package com.aixcode.autoTest.version1.copilot;

public class Copilot401 {
    /**
     * 得到现在时间
     */
    public static String getStringToday(String format)
    {
        java.util.Date today = new java.util.Date();
        java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(format);
        String dateString = formatter.format(today);
        return dateString;
    }

}
