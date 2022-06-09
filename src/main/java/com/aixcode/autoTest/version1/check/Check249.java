package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder249;
import com.aixcode.autoTest.version1.copilot.Copilot249;

import java.util.HashMap;
import java.util.Map;

public class Check249 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot249 solution=new Copilot249();
        Map<String,Object> mapTest = new HashMap<String,Object>();
        mapTest.put("name","张三");
        mapTest.put("valueEmpty","");
        mapTest.put("valueBlank","    ");
        mapTest.put("valueNull",null);
        mapTest.put("","KEY_EMPTY");//key为空

        Map<String,Object> mapKeyNull = new HashMap<>();
        mapTest.put(null,"keyNull");//key为null


        int fail_count = 0;
        int total_count = 0;
        int pass_count = 0;
        try {
            total_count = mapTest.size();
            solution.removeNullValue(mapTest);

            for (String keyValue : mapTest.keySet()) {
                if (keyValue != null && keyValue != "") {
                    if(keyValue.equals("valueEmpty") || keyValue.equals("valueBlank") || keyValue.equals("valueNull")){
                        fail_count++;
                    }
                }else{
                    fail_count++;
                }
            }
            pass_count = total_count - fail_count;
            System.out.println(pass_count);

        }catch(Exception e){
//            e.printStackTrace();
        }

        try {
            total_count += mapKeyNull.size();
            solution.removeNullValue(mapKeyNull);
            if(mapKeyNull.size() == 0){
                pass_count++;
            }
        }catch (Exception e){

        }
        return new int[]{pass_count,total_count};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder249 solution=new Aixcoder249();
        Map<String,Object> mapTest = new HashMap<String,Object>();
        mapTest.put("name","张三");
        mapTest.put("valueEmpty","");
        mapTest.put("valueBlank","    ");
        mapTest.put("valueNull",null);
        mapTest.put("","KEY_EMPTY");//key为空

        Map<String,Object> mapKeyNull = new HashMap<>();
        mapTest.put(null,"keyNull");//key为null


        int fail_count = 0;
        int total_count = 0;
        int pass_count = 0;
        try {
            total_count = mapTest.size();
            solution.removeNullValue(mapTest);

            for (String keyValue : mapTest.keySet()) {
                if (keyValue != null && keyValue != "") {
                    if(keyValue.equals("valueEmpty") || keyValue.equals("valueBlank") || keyValue.equals("valueNull")){
                        fail_count++;
                    }
                }else{
                    fail_count++;
                }
            }
            pass_count = total_count - fail_count;
            System.out.println(pass_count);

        }catch(Exception e){
//            e.printStackTrace();
        }

        try {
            total_count += mapKeyNull.size();
            solution.removeNullValue(mapKeyNull);
            if(mapKeyNull.size() == 0){
                pass_count++;
            }
        }catch (Exception e){

        }
        return new int[]{pass_count,total_count};
    }
}