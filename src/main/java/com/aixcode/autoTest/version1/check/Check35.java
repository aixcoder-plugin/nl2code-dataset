package com.aixcode.autoTest.version1.check;



import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder35;
import com.aixcode.autoTest.version1.copilot.Copilot35;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Check35 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot35 solution = new Copilot35();
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

    @Override
    public int[] checkAixcoder() {
        Aixcoder35 solution = new Aixcoder35();
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
