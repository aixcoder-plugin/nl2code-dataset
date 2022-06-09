package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder259;
import com.aixcode.autoTest.version1.copilot.Copilot259;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Check259 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot259 solution = new Copilot259();
        List<String> list1 = new ArrayList<String>(){{
            add("a");
            add("b");
            add("c");
        }};
        List<String> list2 = new ArrayList<String>(){{
            add("d");
            add("e");
            add("f");
        }};
        List<String> list3 = new ArrayList<String>(){{
            add("你");
            add("我");
            add("他");
        }};
        List<String> list4 = new ArrayList<String>(){{
            add("1");
            add("2");
            add("3");
        }};
        List<String> list5 = new ArrayList<String>(){{
            add("4");
            add("5");
            add("6");
        }};

        Map<List<String>,String> map = new HashMap<List<String>,String>(){{
            put(list1,"a,bandc");
            put(list2,"d,eandf");
            put(list3,"你,我and他");
            put(list4,"1,2and3");
            put(list5,"4,5and6");
        }};
        int pass_count = 0;

        for(Map.Entry<List<String>,String> entry:map.entrySet()){
            try{
                if(solution.collectionToCommaDelimitedString(entry.getKey()).replaceAll(" ","").equals(entry.getValue())){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder259 solution = new Aixcoder259();
        List<String> list1 = new ArrayList<String>(){{
            add("a");
            add("b");
            add("c");
        }};
        List<String> list2 = new ArrayList<String>(){{
            add("d");
            add("e");
            add("f");
        }};
        List<String> list3 = new ArrayList<String>(){{
            add("你");
            add("我");
            add("他");
        }};
        List<String> list4 = new ArrayList<String>(){{
            add("1");
            add("2");
            add("3");
        }};
        List<String> list5 = new ArrayList<String>(){{
            add("4");
            add("5");
            add("6");
        }};

        Map<List<String>,String> map = new HashMap<List<String>,String>(){{
            put(list1,"a,bandc");
            put(list2,"d,eandf");
            put(list3,"你,我and他");
            put(list4,"1,2and3");
            put(list5,"4,5and6");
        }};
        int pass_count = 0;

        for(Map.Entry<List<String>,String> entry:map.entrySet()){
            try{
                if(solution.collectionToCommaDelimitedString(entry.getKey()).replaceAll(" ","").equals(entry.getValue())){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
