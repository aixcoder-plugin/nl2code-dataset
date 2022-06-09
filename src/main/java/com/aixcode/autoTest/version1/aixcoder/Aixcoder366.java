package com.aixcode.autoTest.version1.aixcoder;

import java.text.DateFormat;
import java.util.Date;

public class Aixcoder366 {
    /**
     * 将 Date 类型转为时间字符串，格式为 format
     */
    public String date2String(final Date date, final DateFormat format) {
        if (format != null) {
            return format.format(date);
        } else {
            return null;
        }
    }
}
