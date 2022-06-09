package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder385;
import com.aixcode.autoTest.version1.copilot.Copilot385;

import java.util.*;

public class Check385 extends BaseAbstractTest {
    Map<String,String> map11=new HashMap<>(){{
        put("a","1");
        put("b","2");
        put("c","3");
    }
    };
    Map<String,String> map12=new HashMap<>(){{
        put("d","1");
        put("e","2");
        put("c","3");
    }
    };
    Map<String,String> map21=new HashMap<>(){{
        put("a","1");
    }
    };
    Map<String,String> map22=new HashMap<>(){{
        put("d","1");
    }
    };
    Map<String,String> map31=new HashMap<>(){{
        put("a","1");
    }
    };
    Map<String,String> map32=new HashMap<>(){{
        put("1","1");
    }
    };
    List<Map<String,String>> map1List=new ArrayList<>(){{
        add(map11);
        add(map21);
        add(map31);
    }
    };
    List<Map<String,String>> map2List=new ArrayList<>(){{
        add(map12);
        add(map22);
        add(map32);
    }
    };


    @Override
    public int[] checkCopilot() {
        Copilot385 solution=new Copilot385();
        int passCount=0;
        for (int i=0;i<map1List.size();i++){
            Map<String,String> map1=map1List.get(i);
            Map<String,String> map2=map2List.get(i);
            try {
                String res=solution.diff(map1, map2);
                String canonicalRes=canonicalSolution(map1, map2);
                if (res.equals(canonicalRes)){
                    passCount+=1;
                }
            }catch (Exception e){

            }

        }
        return new int[]{passCount, 3};
    }

    private static String canonicalSolution(java.util.Map<String, String> map1, java.util.Map<String, String> map2){
        Set<String> map1Set=map1.keySet();
        Set<String> map2Set=map2.keySet();
        Set<String> set1Copy=new HashSet<>(map1Set);
        map1Set.removeAll(map2Set);
        map2Set.removeAll(set1Copy);
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("map1:");
        for (String key:map1Set){
            stringBuilder.append(key).append(",");
        }

        StringBuilder stringBuilder2=new StringBuilder();
        stringBuilder2.append("map2:");
        for (String key:map2Set){
            stringBuilder2.append(key).append(",");
        }

        return stringBuilder.substring(0,stringBuilder.length()-1)+" "+stringBuilder2.substring(0,stringBuilder2.length()-1);

    }

    public static void main(String[] args) {
        Map<String,String> map1=new HashMap<>(){{
            put("a","1");
            put("b","2");
            put("c","3");
        }
    };
        Map<String,String> map2=new HashMap<>(){{
            put("d","1");
            put("e","2");
            put("c","3");
        }
    };
        System.out.println(canonicalSolution(map1,map2));
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder385 solution=new Aixcoder385();
        int passCount=0;
        for (int i=0;i<map1List.size();i++){
            Map<String,String> map1=map1List.get(i);
            Map<String,String> map2=map2List.get(i);
            try {
                String res=solution.diff(map1, map2);
                String canonicalRes=canonicalSolution(map1, map2);
                if (res.equals(canonicalRes)){
                    passCount+=1;
                }
            }catch (Exception e){

            }

        }
        return new int[]{passCount, 3};
    }
}

