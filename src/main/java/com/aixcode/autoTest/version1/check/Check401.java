package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder401;
import com.aixcode.autoTest.version1.copilot.Copilot401;

import java.text.SimpleDateFormat;
import java.util.*;

public class Check401 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot401 solution = new Copilot401();
        List<String> listFormat = new ArrayList<>();
        listFormat.add("yyyy-MM-dd HH:mm:ss");
        listFormat.add("EEE, MMM d, ''yy");
        listFormat.add("yyyy.MM.dd G 'at' HH:mm:ss z");
        listFormat.add("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        listFormat.add("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        listFormat.add("yyMMddHHmmssZ");
        listFormat.add("yyyyy.MMMMM.dd GGG hh:mm aaa");

        int pass_count = 0;
        int total_count = 0;
        try{
            total_count = listFormat.size();
            for (String sFormat: listFormat) {
                SimpleDateFormat sdf = new SimpleDateFormat(sFormat);
                if(solution.getStringToday(sFormat).length() == (sdf.format(new Date()).length())){
                    pass_count++;
                }else {
                    System.out.println(solution.getStringToday(sFormat));
                    System.out.println(sdf.format(new Date()));
                }
            }

        }catch (Exception e){

        }
        try {
            total_count++;
            if (solution.getStringToday("").equals("")) {
                pass_count++;
            }
            else {
                System.out.println(solution.getStringToday(""));
            }
        }catch (Exception e){
        }

        try{
            total_count++;
            if(solution.getStringToday(null).equals("")){
                pass_count++;
            }
        }catch (Exception e){
        }

        return new int[]{pass_count, total_count};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder401 solution = new Aixcoder401();
        List<String> listFormat = new ArrayList<>();
        listFormat.add("yyyy-MM-dd HH:mm:ss");
        listFormat.add("EEE, MMM d, ''yy");
        listFormat.add("yyyy.MM.dd G 'at' HH:mm:ss z");
        listFormat.add("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        listFormat.add("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        listFormat.add("yyMMddHHmmssZ");
        listFormat.add("yyyyy.MMMMM.dd GGG hh:mm aaa");

        int pass_count = 0;
        int total_count = 0;
        try{
            total_count = listFormat.size();
            for (String sFormat: listFormat) {
                SimpleDateFormat sdf = new SimpleDateFormat(sFormat);
                if(solution.getStringToday(sFormat).length() == (sdf.format(new Date()).length())){
                    pass_count++;
                }else {
                    System.out.println(solution.getStringToday(sFormat));
                    System.out.println(sdf.format(new Date()));
                }
            }

        }catch (Exception e){

        }
        try {
            total_count++;
            if (solution.getStringToday("").equals("")) {
                pass_count++;
            }
            else {
                System.out.println(solution.getStringToday(""));
            }
        }catch (Exception e){
        }

        try{
            total_count++;
            if(solution.getStringToday(null).equals("")){
                pass_count++;
            }
        }catch (Exception e){
        }
        return new int[]{pass_count, total_count};
    }
}
