package com.aixcode.autoTest.aixcoderV2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld54 extends GenerateMethodBase {
    public String toJson(Object object) {
        try {
            return new ObjectMapper().writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting object to JSON", e);
        }
    }
}
