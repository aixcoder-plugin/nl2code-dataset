package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder275;

public class AixcoderOld75 extends GenerateMethodBase {
    public int getDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2) {
            if (Aixcoder275.isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
        return 0;
    }
}
