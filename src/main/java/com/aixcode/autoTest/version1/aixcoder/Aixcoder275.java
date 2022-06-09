package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder275 {
    /**
     * Get the number of days for the given month in the given year.
     */
    public static int getDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }

        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }

        return 0;
    }

    /**
     * Check if the given year is a leap year.
     */
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
