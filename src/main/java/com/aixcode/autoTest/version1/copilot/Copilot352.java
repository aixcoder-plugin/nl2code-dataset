package com.aixcode.autoTest.version1.copilot;

public class Copilot352 {
    /**
     * 得到距离当前时间前一年的时间
     */
    public static String getLastYearDate() {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.add(java.util.Calendar.YEAR, -1);
        return new java.text.SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
    }

}
