package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew98 extends GenerateMethodBase {
    public String convertMnemonicString(String text) {
// NOI18N
        if (text == null) {
// NOI18N
            return "";
        }
        int mnemonicIndex = text.indexOf('&');
        if (mnemonicIndex < 0) {
            return text;
        }
        char mnemonic = text.charAt(mnemonicIndex + 1);
        if (mnemonic == ' ') {
// NOI18N
            return text;
        }
        text = text.substring(0, mnemonicIndex) + text.substring(mnemonicIndex + 1);
        if (text.charAt(0) == ' ') {
// NOI18N
            return "" + text.charAt(0) + text.substring(1);
        } else {
// NOI18N
            return "" + mnemonic + text.substring(1);
        }
    }
}
