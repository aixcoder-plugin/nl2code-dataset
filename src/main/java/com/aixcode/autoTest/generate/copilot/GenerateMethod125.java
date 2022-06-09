package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod125 extends GenerateMethodBase {

    /**
     * 判断某个日期属于本月的第几天
     */
    public int getDaysByMonth(String dateTime) {
        int days = 0;
        try {
            java.util.Date date = new java.util.Date(dateTime);
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
            String dateStr = sdf.format(date);
            String[] dateArr = dateStr.split("-");
            int year = Integer.parseInt(dateArr[0]);
            int month = Integer.parseInt(dateArr[1]);
            int day = Integer.parseInt(dateArr[2]);
            days = day;
        } catch (Exception e) {
//            e.printStackTrace();
        }
        return days;
    }
}
