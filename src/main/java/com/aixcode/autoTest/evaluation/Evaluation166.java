package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;
import com.aixcode.sampleHelperClass.Student;

import java.util.ArrayList;
import java.util.List;

public class Evaluation166 extends AbstractBaseEvaluation {
    public Evaluation166(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int passCount = 0;
        Student student=new Student();

        try {
            student=solution.initByReflect("name","musk",student);
            if ("musk".equals(student.name)) {
                passCount++;
            }
        }catch (Exception e){

        }
        try {
            student=solution.initByReflect("age",18,student);
            if (18==student.getAge()) {
                passCount++;
            }

        }catch (Exception e){

        }
        try {
            List<String> teachers=new ArrayList<>(){
                {
                    add("teacher1");
                    add("teacher2");
                    add("teacher3");
                }
            };
            student=solution.initByReflect("teachers",teachers,student);
            List<String> reflectTeachers=student.getTeachers();

            if(teachers!=null&&teachers.size()==reflectTeachers.size()){
                if (teachers.containsAll(reflectTeachers)&&reflectTeachers.containsAll(teachers)) {
                    passCount++;
                }

            }
        }catch (Exception e){

        }




        return new int[]{passCount,3};
    }

}
