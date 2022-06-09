package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class AixcoderNew47 extends GenerateMethodBase {
    public List<Field> getFields(Class<?> clazz) {
        try {
// 获取该类所有的成员变量
//            return getFieldList(clazz);
        } catch (Throwable e) {
            return new ArrayList<>();
        }
        return new ArrayList<>();
    }
}
