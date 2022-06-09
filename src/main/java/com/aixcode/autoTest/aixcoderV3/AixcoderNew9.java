package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.DateFormat;
import java.util.Date;

public class AixcoderNew9 extends GenerateMethodBase {
    public String date2String(final Date date, final DateFormat format) {
        if (date == null)
            return null;
        return format.format(date);
    }
}
