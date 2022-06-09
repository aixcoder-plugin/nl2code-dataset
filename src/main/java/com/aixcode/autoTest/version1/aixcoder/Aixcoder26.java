package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder26 {
    public static boolean isNumber(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }

        char[] chars = str.toCharArray();
        int sz = chars.length;
        boolean hasExp = false;
        boolean hasDecPoint = false;
        boolean allowSigns = false;
        boolean foundDigit = false;
        //deal with any possible sign up front
        int start = (chars[0] == '-') ? 1 : 0;

        if (sz > start + 1) {
            if (chars[start] == '0' && chars[start + 1] == 'x') {
                int i = start + 2;

                if (i == sz) {
                    return false;
                }

                //checking hex(it can't be anything else)
                for (; i < chars.length; i++) {
                    if ((chars[i] < '0' || chars[i] > '9') && (chars[i] < 'a' || chars[i] > 'f') && (chars[i] < 'A' || chars[i] > 'F')) {
                        return false;
                    }
                }

                return true;
            }
        }

        //don't want to loop to the last char,check it afterwords
        sz--;
        //for type qualifiers
        int i = start;

        //make a valid number(e.g.chars[0..5]="1234E")
        while (i < sz || (i < sz + 1 && allowSigns && !foundDigit)) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                foundDigit = true;
                allowSigns = false;
            } else if (chars[i] == '.') {
                if (hasDecPoint || hasExp) {
                    //two decimal points or dec in exponent
                    return false;
                }

                hasDecPoint = true;
            } else if (chars[i] == 'e' || chars[i] == 'E') {
                //we've already taken care of hex.
                if (hasExp) {
                    //two E's
                    return false;
                }

                if (!foundDigit) {
                    return false;
                }

                hasExp = true;
                allowSigns = true;
            } else if (chars[i] == '+' || chars[i] == '-') {
                if (!allowSigns) {
                    return false;
                }

                allowSigns = false;
                //we need a digit after the E
                foundDigit = false;
            } else {
                return false;
            }

            i++;
        }

        if (i < chars.length) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                //no type qualifier,OK
                return true;
            }

            if (chars[i] == 'e' || chars[i] == 'E') {
                //can't have an E at the last byte
                return false;
            }

            if (chars[i] == '.') {
                if (hasDecPoint || hasExp) {
                    //two decimal points or dec in exponent
                    return false;
                }

                //single trailing decimal point after non-exponent is ok
                return foundDigit;
            }

            if (!allowSigns && (chars[i] == 'd' || chars[i] == 'D' || chars[i] == 'f' || chars[i] == 'F')) {
                return foundDigit;
            }

            if (chars[i] == 'l' || chars[i] == 'L') {
                //not allowing L with an exponent or decimal point
                return foundDigit && !hasExp && !hasDecPoint;
            }

            //last character is illegal
            return false;
        }

        //found digit it to make sure weird stuff like'.'and'1E-'doesn't pass
        return foundDigit;
    }
}
