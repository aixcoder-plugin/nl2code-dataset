package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;
import com.aixcode.sampleHelperClass.Student;

import java.util.Arrays;
import java.util.List;

public class Evaluation167 extends AbstractBaseEvaluation {
    public Evaluation167(String basePackage, String prefix) {
        super(basePackage, prefix);
    }


    @Override
    public int[] evaluation() {
        int passCount = 0;
        try {
            Integer[] intArray = new Integer[]{1, 2, 3, 4, 5};
            List<Integer> intList = solution.array2List(intArray);
            List<Integer> intList2 = Arrays.asList(1, 2, 3, 4, 5);
            if (intList.size() == intList2.size()) {
                if (intList.containsAll(intList2) && intList2.containsAll(intList)) {
                    passCount++;
                }
            }
        } catch (Exception e) {

        }
        try {
            String[] strArray = new String[]{"a", "b", "c", "d", "e"};
            List<String> strList = solution.array2List(strArray);
            List<String> strList2 = Arrays.asList("a", "b", "c", "d", "e");
            if (strList.size() == strList2.size()) {
                if (strList.containsAll(strList2) && strList2.containsAll(strList)) {
                    passCount++;
                }
            }
        } catch (Exception e) {

        }


        try {
            Student student1 = new Student("zhangsan", 18, Arrays.asList("teacher1", "teacher2", "teacher3"));
            Student student2 = new Student("lisi", 19, Arrays.asList("teacher11", "teacher12", "teacher13"));
            Student[] studentArray = new Student[]{student1, student2};
            List<Student> studentList = solution.array2List(studentArray);
            List<Student> studentList2 = Arrays.asList(student1, student2);
            if (studentList.size() == studentList2.size()) {
                if (studentList.containsAll(studentList2) && studentList2.containsAll(studentList)) {
                    passCount++;
                }
            }
        } catch (Exception e) {

        }


        return new int[]{passCount, 3};
    }
}
