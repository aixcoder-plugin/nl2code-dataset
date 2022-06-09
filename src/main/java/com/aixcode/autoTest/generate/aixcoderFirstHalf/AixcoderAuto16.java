package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto16 extends GenerateMethodBase {
    /**
     * Get a hashCode for the real vector. All NaN values have the same hash code.
     */
    public int hashCode(double[] vector) {
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
