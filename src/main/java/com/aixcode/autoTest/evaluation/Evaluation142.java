package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation142 extends AbstractBaseEvaluation {
    public Evaluation142(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    Map<String,String> map=new HashMap<>(){{
        put("http://www.baidu.com","www.baidu.com");
        put("www.google.com","www.google.com");
        put("https://www.bing.com/search?q=domain&qs=n&form=QBRE&sp=-1&pq=domain&sc=8-6&sk=&cvid=1C658B170D0D4045A88463377AE70CAE","www.bing.com");
    }};

    @Override
    public int[] evaluation() {
        int passCount = 0;
        for (Map.Entry<String,String> entry:map.entrySet()){
            try {
                String url=entry.getKey();
                String domain=entry.getValue();
                String host=solution.getTopDomain(url);
                if (domain.equals(host)){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,map.size()};
    }
}
