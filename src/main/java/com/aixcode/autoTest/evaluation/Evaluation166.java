package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;
import com.aixcode.sampleHelper.Student;

import java.util.HashMap;
import java.util.Map;

public class Evaluation166 extends AbstractBaseEvaluation {
    public Evaluation166(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int passCount = 0;
        Student student=new Student();
        Map<String,String> map = new HashMap<>(){
            {
                put("name1", "lucky");
                put("name2", null);
                put("name3", "");
                put("teachers", "{\"teacher1\",\"teacher2\"}");//给数组类型赋值
                put("age", String.valueOf(18));//给整型的值赋值
            }};

            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                try {
                student=solution.initByReflect(key,value,student);
                } catch(IllegalArgumentException ex){
                    //System.out.println("IllegalArgumentException");
                } catch (Exception e){
                }

                if (value == null && value == student.getValueByName(key)) {
                    passCount++;
                } else if (value != null && value.equals(student.getValueByName(key))) {
                    passCount++;
                }
            }

        return new int[]{passCount,map.size()};
    }

}
