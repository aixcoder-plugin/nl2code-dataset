package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Calendar;

public class GenerateMethod128 extends GenerateMethodBase {

    /**
     * Clear the given calendar, setting to zero all time values less than or equal to that of the given field. For example, clearing to Calendar#HOUR will floor the time to nearest hour which occurred before or at the given time (e.g., 1:32 --> 1:30).
     */
    public Calendar clearTo(Calendar c, int field) {
        return c;
    }

//    public static void main(String[] args) {
//        Calendar cal = Calendar.getInstance();
//        System.out.println(cal.getTime());
//    }
}
