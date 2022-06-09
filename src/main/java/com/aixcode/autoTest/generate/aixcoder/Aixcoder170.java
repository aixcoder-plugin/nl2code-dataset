package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder170 extends GenerateMethodBase {
    public String getLunarDate(int year_log, int month_log, int day_log) {
        String message = "";

        //传入的年、月、日不合法直接返回
        if (year_log < 0 || year_log > 20 || month_log < 1 || month_log > 12 || day_log < 1 || day_log > 31) {
            return message;
        }

        //转换成1号
        int year = year_log;
        int month = month_log;
        int day = day_log;

        if (month > 12) {
            month = month % 12;
            year = year + 1;
        }

        if (day > 31) {
            day = day % 31;
            month = month + 1;
        }

        //年
        String strYear = "";
        //月
        String strMonth = "";
        //日
        String strDay = "";

        if (year > 0) {
            strYear = "" + ("" + year);
        }

        if (month > 0) {
            strMonth = "" + ("" + month);
        }

        if (day > 0) {
            strDay = "" + ("" + day);
        }

        //转换成农历
        String myLunarString = "";
        myLunarString = strYear + "年" + strMonth + "月" + strDay + "日";
        return myLunarString;
    }
}
