package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.List;

public class Evaluation43 extends AbstractBaseEvaluation {


    public Evaluation43(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        List<String> list = new ArrayList<>();
        list.add("Http://www.baidu.com?a=%s&b=2");//正常替换
        list.add("Http://www.baidu.com?params=0&a=%s&b=2");//正常替换
        list.add("Http://www.baidu.com?a=%s&b=2&a=3");// 两个A
        list.add("Http://www.baidu.com");//没有参数
        list.add("Http://www.baidu.com?b=2&d=4");//有参数，但没有指定参数
        String Key = "a";
        String Value = "5";
        int pass_count = 0;
        int total_count = 0;
        for (String s : list) {
            total_count++;
            String urlString = String.format(s, 1);
            try {
                String replacedURL = solution.updateUrl(urlString, Key, Value);
                if (replacedURL.contains(Key + "=" + Value)) {
                    pass_count++;
                } else if (s.equals("Http://www.baidu.com") || s.equals("Http://www.baidu.com?b=2&d=4")) {
                    pass_count++;
                }

            } catch (Exception e) {
                continue;
            }
        }
        return new int[]{pass_count,total_count};
    }
}
