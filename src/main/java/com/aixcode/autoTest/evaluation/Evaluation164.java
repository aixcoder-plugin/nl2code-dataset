package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.*;


public class Evaluation164 extends AbstractBaseEvaluation {
    public Evaluation164(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    List<Map<Integer, String>> mapList = new ArrayList<Map<Integer, String>>() {
        {
            add(new HashMap<Integer, String>() {
                {
                    put(1, "a");
                    put(2, "b");
                    put(3, "c");
                    put(4, "b");
                    put(5, "b");
                }
            });
            add(new HashMap<Integer, String>() {
                {
                    put(1, "a");
                    put(2, "a");
                    put(3, "a");
                }
            });
            add(new HashMap<Integer, String>() {
                {
                    put(1, "aa");
                    put(2, "bb");
                }
            });
            add(new HashMap<Integer, String>());
        }
    };

    List<Map<String, Set<Integer>>> reverseMapList = new ArrayList<>() {
        {
            add(new HashMap<String, Set<Integer>>() {
                {
                    put("a", new HashSet<Integer>() {
                        {
                            add(1);
                        }
                    });
                    put("b", new HashSet<Integer>() {
                        {
                            add(4);
                            add(2);
                            add(5);
                        }
                    });
                    put("c", new HashSet<Integer>() {
                        {
                            add(3);
                        }
                    });
                }
            });
            add(new HashMap<String, Set<Integer>>() {
                {
                    put("a", new HashSet<Integer>() {
                        {
                            add(1);
                            add(2);
                            add(3);
                        }
                    });
                }
            });
            add(new HashMap<String, Set<Integer>>() {
                {
                    put("aa", new HashSet<Integer>() {
                        {
                            add(1);

                        }
                    });
                    put("bb", new HashSet<Integer>() {
                        {
                            add(2);

                        }
                    });
                }
            });
            add(new HashMap<String, Set<Integer>>());
        }
    };

    @Override
    public int[] evaluation() {
        int passCount = 0;
        for (int i = 0; i < mapList.size(); i++) {
            try {
                Map<Integer, String> map = mapList.get(i);
                Map<String, Set<Integer>> reverseMap = reverseMapList.get(i);
                Map<String, Set<Integer>> result = solution.reverseMapIntoValueSetMap(map);
                if (reverseMap.size() == 0) {
                    if (result == null || result.size() == 0) {
                        passCount++;
                    }
                } else {
                    boolean isEqual = true;
                    for (Map.Entry<String, Set<Integer>> entry : reverseMap.entrySet()) {
                        Set<Integer> targetKeys = entry.getValue();
                        Set<Integer> predictKeys = result.get(entry.getKey());
                        if (targetKeys == null || targetKeys.size() == 0) {
                            if (!(predictKeys == null || predictKeys.size() == 0)) {
                                isEqual = false;
                                break;
                            }
                        } else {
                            if (targetKeys.size() == predictKeys.size()) {
                                if (!(targetKeys.containsAll(predictKeys) && predictKeys.containsAll(targetKeys))) {
                                    isEqual=false;
                                    break;
                                }
                            }
                        }
                    }
                    if (isEqual) {
                        passCount++;
                    }
                }
            } catch (Exception e) {

            }

        }

        return new int[]{passCount, mapList.size()};
    }
}
