package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AixcoderAuto64 extends GenerateMethodBase {
    public String getStringToday(String format) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        String dateString = formatter.format(currentTime);
        return dateString;
    }
}
