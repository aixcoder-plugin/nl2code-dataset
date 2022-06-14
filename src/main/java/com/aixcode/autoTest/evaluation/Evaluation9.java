package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Evaluation9 extends AbstractBaseEvaluation {


    public Evaluation9(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        try {
            Date date = new Date();
            DateFormat format =  new SimpleDateFormat( "yyyy-MM-dd");
            Map<String,String> map = new HashMap<String, String>(){{
                put("yyyy-MM-dd",new SimpleDateFormat("yyyy-MM-dd").format(date));
                put("yyyy-MM-dd HH:mm:ss", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
                put("yyyy-MM-dd HH:mm:ss zzzz", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss zzzz").format(date));
                put("EEEE yyyy-MM-dd HH:mm:ss zzzz", new SimpleDateFormat("EEEE yyyy-MM-dd HH:mm:ss zzzz").format(date));
                put("yyyy-MM-dd HH:mm:ss.SSSZ", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ").format(date));
            }};
            int pass_count = 0;
            for (Map.Entry<String, String> entry : map.entrySet()){
                try {
                    if (solution.date2String(date,new SimpleDateFormat(entry.getKey())).equals(entry.getValue())){
                        pass_count++;
                    }
                }catch (Exception e) {

                }
            }
            return new int[]{pass_count,map.size()};
        }catch (Exception e){
            return new int[] {0, 5};
        }
    }
}
