package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Calendar;

public class Aixcoder128 extends GenerateMethodBase {
    public Calendar clearTo(Calendar c, int field) {
//        int i = indexOf(c, field);
//
//        if (i == -1) {
//            throw new IllegalArgumentException("Invalid field" + field);
//        }
//
//        c.clear(field);
//
//        if (field == Calendar.DAY_OF_MONTH) {
//            c.set(Calendar.DAY_OF_MONTH, 1);
//        }
//
//        if (field == Calendar.MONTH) {
//            c.set(Calendar.MONTH, 0);
//        }
//
//        if (field == Calendar.YEAR) {
//            c.set(Calendar.YEAR, 0);
//        }
//
//        if (field == Calendar.HOUR_OF_DAY) {
//            c.clear(Calendar.HOUR_OF_DAY);
//            System.out.println(c.get(Calendar.HOUR_OF_DAY));
//        }
//
//        if (field == Calendar.MINUTE) {
//            c.clear(Calendar.MINUTE);
//        }
//
//        if (field == Calendar.SECOND) {
//            c.clear(Calendar.SECOND);
//        }
//
//        if (field == Calendar.MILLISECOND) {
//            c.clear(Calendar.MILLISECOND);
//        }
//
//        return c;
        return c;
    }
    public static Calendar clearTos(Calendar c, int field) {
        int[] CALENDAR_FIELDS = new int[]{0,1,2,3,4, 5, 6, 7,8,9,10,11,12,13,14,15,16};
        int i = CALENDAR_FIELDS.length - 1;
        for (; i >= 1 && field != CALENDAR_FIELDS[i]; i--) {
            int val = (CALENDAR_FIELDS[i] == Calendar.DATE ? 1 : 0);
            c.set(CALENDAR_FIELDS[i], val);
            System.out.println(CALENDAR_FIELDS[i]+"__"+c.get(CALENDAR_FIELDS[i]));
        }
        if (field == Calendar.YEAR){

            int y = c.get(Calendar.YEAR);
            y = -field * (y / -field);
            c.set(Calendar.YEAR, y);
        }
        return c;
    }
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        cal = new Aixcoder128().clearTos(cal,11);

    }
}
