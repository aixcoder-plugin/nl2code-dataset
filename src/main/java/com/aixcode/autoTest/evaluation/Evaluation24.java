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
        List<String> list2 = new ArrayList<String>(){{add("b"); add("c");}};
        List<String> list3 = new ArrayList<String>(){{add("c"); add("d");}};
        List<String> list4 = new ArrayList<String>(){{add("d"); add("e");}};
        List<String> list5 = new ArrayList<String>(){{add("e"); add("f");}};
        Map<List<String>,String> map = new HashMap<List<String>,String>(){{
            put(list1, "a");
            put(list2, "b");
            put(list3, "c");
            put(list4, "d");
            put(list5, "e");
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
