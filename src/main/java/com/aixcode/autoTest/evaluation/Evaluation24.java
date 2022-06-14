package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluation24 extends AbstractBaseEvaluation {


    public Evaluation24(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0 ;
        List<String> list1 = new ArrayList<String>(){{add("a"); add("b");}};
        List<String> list2 = new ArrayList<String>(){{add(""); add("c");}};
        List<String> list3 = new ArrayList<String>(){{add("      "); add("d");}};

        List<String> list4 = new ArrayList<String>(){{
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 1024; i++) {
                sb.append("a");
            }
            add(sb.toString());//1024个a
        }};
        List<String> list5 = new ArrayList<String>(){{
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 1025; i++) {
                sb.append("b");
            }
            add(sb.toString());//1025个b
        }};
        Map<List<String>,String> map = new HashMap<List<String>,String>(){{
            put(list1, "a");
            put(list2, "");
            put(list3, "      ");
            put(list4, list4.get(0));
            put(list5, list5.get(0));
        }};
        for (Map.Entry<List<String>, String> entry : map.entrySet()){
            try {
                String fileName = "autoTest.txt";
                solution.writeFile(entry.getKey(),new File(fileName));
                File file = new File(fileName);
                if (file.exists()){
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String line = null;
                    while ((line = br.readLine())!= null){
                        if (line.equals(entry.getValue())){
                            pass_count++;
                        }else {
                            System.out.println(line + " " + entry.getValue());
                        }
                        break ;
                    }
                    br.close();
                    file.delete();
                }
            }catch (Exception e) {

            }
        }
        return new int[] {pass_count, map.size()};
    }
}
