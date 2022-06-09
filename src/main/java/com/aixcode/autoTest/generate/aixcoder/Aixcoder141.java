package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aixcoder141 extends GenerateMethodBase {
    /**
     *  两个时间之间相差距离多少天,时间格式yyyy-MM-dd
     */
    @Override
    public long getDistanceDays(String str1, String str2) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        long day = 0;

        try {
            Date start = df.parse(str1);
            Date end = df.parse(str2);
            long time1 = start.getTime();
            long time2 = end.getTime();
            long diff;

            if (time1 < time2) {
                diff = time2 - time1;
            } else {
                diff = time1 - time2;
            }

            day = diff / (24 * 60 * 60 * 1000);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return day;
    }
}
