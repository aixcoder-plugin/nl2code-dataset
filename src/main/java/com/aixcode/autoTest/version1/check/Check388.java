package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder388;
import com.aixcode.autoTest.version1.copilot.Copilot388;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Check388 extends BaseAbstractTest {
    List<String> list = new ArrayList<>(){
        {
            add("path11"+ File.pathSeparator);
            add("");
            add("path13");
        }
    };
    List<String> list2=new ArrayList<>(){
        {
            add(File.pathSeparator+"path21");
            add(File.pathSeparator+"path22");
            add(File.pathSeparator+"path23");
        }
    };
    List<String> expected = new ArrayList<>(){
        {
            add("path11"+ File.pathSeparator);
            add(File.pathSeparator+"path22");
            add("path13"+File.pathSeparator+"path23");
        }
    };

    @Override
    public int[] checkCopilot() {
        Copilot388 solution=new Copilot388();
        int passCount=0;
        for (int i=0;i<list.size();i++){
            String value=list.get(i);
            String value2=list2.get(i);
            String value3=expected.get(i);
            try {
                if (solution.joinPath(value,value2).equals(value3)){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,list.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder388 solution=new Aixcoder388();
        int passCount=0;
        for (int i=0;i<list.size();i++){
            String value=list.get(i);
            String value2=list2.get(i);
            String value3=expected.get(i);
            try {
                if (solution.joinPath(value,value2).equals(value3)){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,list.size()};
    }
}
