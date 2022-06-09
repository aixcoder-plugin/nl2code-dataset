package com.aixcode.autoTest.version1.copilot;

public class Copilot289 {
    /**
     * Convert the text '&' mnemonic string to text string. The '&' symbol is treated as the mnemonic pointer. The double "&&" symbols are treated as the single '&'. For example the string "&Look && Feel" is converted to "Look & Feel".
     */
    public static String convertMnemonicString(String text) {
        if (text == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '&') {
                if (i + 1 < text.length()) {
                    char next = text.charAt(i + 1);
                    if (next == '&') {
                        sb.append(next);
                        i++;
                    } else {
                        sb.append(next);
                    }
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
