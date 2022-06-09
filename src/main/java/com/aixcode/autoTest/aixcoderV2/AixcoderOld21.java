package com.aixcode.autoTest.aixcoderV2;

import com.google.gson.JsonElement;
import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.Map;

public class AixcoderOld21 extends GenerateMethodBase {
    public void putAdditionalProperty(String key, Object value, Map<String, Object> additionalProperties) {
        if (value instanceof JsonElement) {
            value = ((JsonElement) value).getAsJsonObject();
        }
        if (additionalProperties == null) {
            additionalProperties = new HashMap<String, Object>();
        }
        additionalProperties.put(key, value);
    }
}
