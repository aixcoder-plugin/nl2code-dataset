package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Aixcoder129 extends GenerateMethodBase {
    /**
     *   获取当前系统时间 minute分钟后 的时间
     */
    @Override
    public String getNowDate(int minute){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MINUTE, minute);
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime());
    }
}
