package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.*;

public class Evaluation13 extends AbstractBaseEvaluation {


    public Evaluation13(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        String[] alphabet = {"abcdefghijklmnopqrstuvwxyz","ABCDEFGHIJKLMNOPQRSTUVWXYZ","0123456789","abcABC012","!@#$%^&*()_+-=[]{}|;':,./<>?", ""};

        int length = 10;
        Map<Integer,String> map = new HashMap<Integer,String>(){{
            put(10,"abcdefghijklmnopqrstuvwxyz");
            put(11,"ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            put(12,"0123456789");
            put(1,"abcABC012");
            put(14,"!@#$%^&*()_+-=[]{}|;':,./<>?");
            put(5,"");
        }};
        int pass_count = 0;

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            try{
                String resultStr = solution.randomString(length, entry.getValue());
                if(entry.getValue() == "" && (resultStr == "" || resultStr == null)){
                    pass_count++;
                } else if(resultStr.length() == length && isCharInAlphabet(resultStr,entry.getValue()))
                {
                    pass_count++;
                }
            }catch(Exception e){
            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }

    private boolean isCharInAlphabet(String target,String alphabet){
        if(target==null||alphabet==null){
            return false;
        }
        char[] targetChars = target.toCharArray();
        Set<Character> alphabetSet = new HashSet<Character>();
        for(char c:alphabet.toCharArray()){
            alphabetSet.add(c);
        }
        boolean isContain = true;
        if(targetChars.length < 1){
            isContain = false;
        }
        for(int i=0;i<targetChars.length;i++){
            if(!alphabetSet.contains(targetChars[i])){
                isContain = false;
                break;
            }
        }
        return isContain;
    }
}
