package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AixcoderOld160 extends GenerateMethodBase {
    public List<String> doDrawRandom(List<String> users, int count) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(users.get(new Random().nextInt(users.size())));
        }
        return result;
    }
}
