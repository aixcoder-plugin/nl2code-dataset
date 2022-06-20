package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AixcoderOld160 extends GenerateMethodBase {
    public List<String> doDrawRandom(List<String> users, int count) {
        List<String> result = new ArrayList<>();
        if (users == null || users.size() <= 0) {
            return result;
        }
        if (count <= 0) {
            return result;
        }
// 随机取一个
        String user = users.get(new Random().nextInt(users.size()));
        result.add(user);
// 如果取不到，随机取一个
        if (result.size() == count) {
            result.add(user);
        }
        return result;
    }
}
