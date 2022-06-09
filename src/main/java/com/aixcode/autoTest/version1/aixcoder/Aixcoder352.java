package com.aixcode.autoTest.version1.aixcoder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aixcoder352 {
    /**
     * 得到距离当前时间前一年的时间
     */
    public static String getLastYearDate() {
        Date date = new Date();
        //可以方便地修改日期格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        String years = dateFormat.format(date);
        return years + "-12-31";
    }

}
