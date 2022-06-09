package com.aixcode.autoTest.evaluation;



import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Evaluation2 extends AbstractBaseEvaluation {


    public Evaluation2(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        String url = "https://www.baidu.com";
        int connectTimeout = 20000;
        Map<String, String> requestProperties = new HashMap<String, String>(){{
            put("Accept","*/*");
        }};
        int pass_count= 0;
        try {
            HttpURLConnection connection = solution.createHttpConnection(new URL(url), connectTimeout, requestProperties);
            if ("*/*".equals(connection.getRequestProperty("Accept"))){
                pass_count++;
            }
        }catch (Exception e) {

        }
        return new int[]{pass_count,1};
    }
}
