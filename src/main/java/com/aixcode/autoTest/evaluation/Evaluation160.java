package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Evaluation160 extends AbstractBaseEvaluation {
    public Evaluation160(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    List<List<String>> users = new ArrayList<>() {
        {
            add(new ArrayList<String>() {
                {
                    add("a");
                    add("b");
                    add("c");
                    add("d");
                    add("e");
                }
            });
            add(new ArrayList<String>() {
                {
                    add("d");
                    add("e");
                    add("f");
                }
            });
            add(new ArrayList<String>() {
                {
                    add("g");
                    add("h");
                    add("i");
                }
            });
            add(new ArrayList<String>() {
                {
                    add("j");
                }
            });
            add(new ArrayList<String>());
        }
    };

    List<Integer> counts = new ArrayList<>() {
        {
            add(3);
            add(2);
            add(0);
            add(1);
            add(0);
        }
    };


    @Override
    public int[] evaluation() {
        int passCount = 0;
        for (int i = 0; i < users.size(); i++) {
            try {
                List<String> user = users.get(i);
                int count = counts.get(i);
                List<String> result = solution.doDrawRandom(user, count);

                if (count == 0) {
                    if (result == null || result.size() == 0)
                        passCount++;
                } else if (result.size() == count) {
                    if (new HashSet<String>(result).size() == count) {
                        for (String s : result) {
                            if (!user.contains(s)) {
                                break;
                            }
                        }
                        passCount++;
                    }
                }
            } catch (Exception e) {

            }

        }

        return new int[]{passCount, users.size()};
    }
}
