package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.Map;

public class AixcoderAuto21 extends GenerateMethodBase {
    /**
     * Set the additional (undeclared) property with the specified name and value. If the property does not already exist, create it otherwise replace it.
     */
    public void putAdditionalProperty(String key, Object value, Map<String, Object> additionalProperties) {
        if (value instanceof Boolean) {
            value = (Boolean) value ? "true" : "false";
        }

        if (additionalProperties == null) {
            additionalProperties = new HashMap<String, Object>();
        }

        additionalProperties.put(key, value);
    }
}
