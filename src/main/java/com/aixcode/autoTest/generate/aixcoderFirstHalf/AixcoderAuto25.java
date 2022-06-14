package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto25 extends GenerateMethodBase {
    /**
     * Generate a hex string for the specified bytes.
     */
    public String toHex(byte[] byteArr) {
        final int nBytes = byteArr.length;
        final StringBuilder sb = new StringBuilder(nBytes * 2);

        for (int i = 0; i < nBytes; ++i) {
            final int intVal = byteArr[i] & 0xFF;

            if (intVal < 0x10) {
                sb.append('0');
            }

            sb.append(Integer.toHexString(intVal));
        }

        return sb.toString();
    }

}
