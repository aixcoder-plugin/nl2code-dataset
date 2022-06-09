package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder373;
import com.aixcode.autoTest.version1.copilot.Copilot373;

import java.util.*;

public class Check373 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot373 solution=new Copilot373();

        Set<Integer> targetEmpty = new HashSet<>(); // empty target
        Set<Integer> targetConflict = new HashSet<>(); //got conflict
        targetConflict.add(1);
        Set<Integer> targetNonConfict = new HashSet<>();// not empty and no confict
        targetNonConfict.add(200);
        targetNonConfict.add(300);
        targetNonConfict.add(400);
        targetNonConfict.add(500);


        Collection<Integer> sourceEmpty = new ArrayList<>();// empty source
        Collection<Integer> sourceConflict = new ArrayList<>();//got conflict with target
        sourceConflict.add(1);
        sourceConflict.add(101);
        sourceConflict.add(102);

        Collection<Integer> sourceDupConflict = new ArrayList<>();//got conflict with target
        sourceDupConflict.add(100);
        sourceDupConflict.add(100);
        sourceDupConflict.add(100);

        Collection<Integer> sourceNonConflict = new ArrayList<>();// not empty and no conflict
        sourceNonConflict.add(1000);
        sourceNonConflict.add(2000);
        sourceNonConflict.add(3000);
        sourceNonConflict.add(4000);
        sourceNonConflict.add(5000);


        int pass_count = 0;
        int total_count = 0;

        try {
            // Test case 1: dup conflict to empty target
            total_count++;
            solution.addAll(targetEmpty, sourceDupConflict);

            if (targetEmpty.size() == 1) {
                pass_count++;
            }
        } catch (Exception e) {

        }

        try {
            targetEmpty = new HashSet<>();
            // Test case 2: non-conflict source to empty target
            total_count++;
            solution.addAll(targetEmpty, sourceNonConflict);

            if (targetEmpty.size() == sourceNonConflict.size()) {
                pass_count++;
            }

        } catch (Exception e) {

        }

        try {
            // Test case 3: conflict source to conflict target
            total_count++;
            solution.addAll(targetConflict, sourceConflict);

            if (targetConflict.size() == sourceConflict.size()) {
                pass_count++;
            }
        } catch (Exception e) {

        }

        try {
            // Test case 4: non-conflict source to non-conflict target
            total_count++;
            int targetSize = targetNonConfict.size();
            solution.addAll(targetNonConfict, sourceNonConflict);

            if (targetNonConfict.size() == sourceNonConflict.size() + targetSize) {
                pass_count++;
            } else {
                System.out.println("targetNonConfict.size() = " + targetNonConfict.size());
            }

        } catch (Exception e) {

        }

        try {
            // Test case 5: empty source to non-conflict target
            total_count++;
            int targetSize = targetNonConfict.size();
            solution.addAll(targetNonConfict, sourceEmpty);

            if (targetNonConfict.size() == targetSize) {
                pass_count++;
            } else {
                System.out.println("targetNonConfict.size() = " + targetNonConfict.size());
            }

        } catch (Exception e) {

        }

        try {
            // Test case 6: conflict source to conflict target
            total_count++;
            int targetSize = targetNonConfict.size();
            solution.addAll(targetConflict, sourceConflict);

            if (targetNonConfict.size() == targetSize) {
                pass_count++;
            } else {
                System.out.println("targetNonConfict.size() = " + targetNonConfict.size());
            }

        } catch (Exception e) {

        }

        return new int[]{pass_count,total_count};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder373 solution=new Aixcoder373();

        Set<Integer> targetEmpty = new HashSet<>(); // empty target
        Set<Integer> targetConflict = new HashSet<>(); //got conflict
        targetConflict.add(1);
        Set<Integer> targetNonConfict = new HashSet<>();// not empty and no confict
        targetNonConfict.add(200);
        targetNonConfict.add(300);
        targetNonConfict.add(400);
        targetNonConfict.add(500);


        Collection<Integer> sourceEmpty = new ArrayList<>();// empty source
        Collection<Integer> sourceConflict = new ArrayList<>();//got conflict with target
        sourceConflict.add(1);
        sourceConflict.add(101);
        sourceConflict.add(102);

        Collection<Integer> sourceDupConflict = new ArrayList<>();//got conflict with target
        sourceDupConflict.add(100);
        sourceDupConflict.add(100);
        sourceDupConflict.add(100);

        Collection<Integer> sourceNonConflict = new ArrayList<>();// not empty and no conflict
        sourceNonConflict.add(1000);
        sourceNonConflict.add(2000);
        sourceNonConflict.add(3000);
        sourceNonConflict.add(4000);
        sourceNonConflict.add(5000);


        int pass_count = 0;
        int total_count = 0;

        try {
            // Test case 1: dup conflict to empty target
            total_count++;
            solution.addAll(targetEmpty, sourceDupConflict);

            if (targetEmpty.size() == 1) {
                pass_count++;
            }
        } catch (Exception e) {

        }

        try {
            targetEmpty = new HashSet<>();
            // Test case 2: non-conflict source to empty target
            total_count++;
            solution.addAll(targetEmpty, sourceNonConflict);

            if (targetEmpty.size() == sourceNonConflict.size()) {
                pass_count++;
            }

        } catch (Exception e) {

        }

        try {
            // Test case 3: conflict source to conflict target
            total_count++;
            solution.addAll(targetConflict, sourceConflict);

            if (targetConflict.size() == sourceConflict.size()) {
                pass_count++;
            }
        } catch (Exception e) {

        }

        try {
            // Test case 4: non-conflict source to non-conflict target
            total_count++;
            int targetSize = targetNonConfict.size();
            solution.addAll(targetNonConfict, sourceNonConflict);

            if (targetNonConfict.size() == sourceNonConflict.size() + targetSize) {
                pass_count++;
            } else {
                System.out.println("targetNonConfict.size() = " + targetNonConfict.size());
            }

        } catch (Exception e) {

        }

        try {
            // Test case 5: empty source to non-conflict target
            total_count++;
            int targetSize = targetNonConfict.size();
            solution.addAll(targetNonConfict, sourceEmpty);

            if (targetNonConfict.size() == targetSize) {
                pass_count++;
            } else {
                System.out.println("targetNonConfict.size() = " + targetNonConfict.size());
            }

        } catch (Exception e) {

        }

        try {
            // Test case 6: conflict source to conflict target
            total_count++;
            int targetSize = targetNonConfict.size();
            solution.addAll(targetConflict, sourceConflict);

            if (targetNonConfict.size() == targetSize) {
                pass_count++;
            } else {
                System.out.println("targetNonConfict.size() = " + targetNonConfict.size());
            }

        } catch (Exception e) {

        }

        return new int[]{pass_count,total_count};
    }

}
