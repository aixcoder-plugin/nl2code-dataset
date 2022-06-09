package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.ArrayList;
import java.util.List;

public class GenerateMethod160 extends GenerateMethodBase {
    /**
     * 随机抽取指定数量的用户，作为中奖用户
     */
    public List<String> doDrawRandom(List<String> users, int count) {
        List<String> result = new ArrayList<>();
        if (users == null || users.size() == 0) {
            return result;
        }
        if (count > users.size()) {
            count = users.size();
        }
        for (int i = 0; i < count; i++) {
            int index = (int) (Math.random() * users.size());
            result.add(users.get(index));
            users.remove(index);
        }
        return result;
    }
}
