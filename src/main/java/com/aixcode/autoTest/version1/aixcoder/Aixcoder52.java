package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder52 {
    /**
     * Get a hashCode for the real vector. All NaN values have the same hash code.
     */
    public static int hashCode(double[] vector) {
        if (vector == null) {
            return 0;
        }

        int h = 1;

        for (double element : vector) {
            int x = (int) Double.doubleToRawLongBits(element);
            h = 31 * h + x;
        }

        return h;
    }
}
