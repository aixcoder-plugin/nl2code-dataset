package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Calendar;

public class AixcoderNew95 extends GenerateMethodBase {
    public boolean equals(Object o1, Object o2) {
        if (o1 == o2)
            return true;
        if ((o1 != null) && (o2 != null)) {
            try {
                if (o1 instanceof Calendar) {
                    if (o2 instanceof Calendar) {
                        Calendar c1 = (Calendar) o1;
                        Calendar c2 = (Calendar) o2;
                        if (c1.get(Calendar.ERA) == c2.get(Calendar.ERA)) {
                            if (c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR)) {
                                return true;
                            }
                        }
                    }
                }
            } catch (Exception e) {
// Might happen if the date objects are not being created in the same thread.
            }
        }
        return false;
    }
}
