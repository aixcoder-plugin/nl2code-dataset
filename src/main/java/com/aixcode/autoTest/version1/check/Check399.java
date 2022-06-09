package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder399;
import com.aixcode.autoTest.version1.copilot.Copilot399;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Check399 extends BaseAbstractTest {
    List<Double> list1=new ArrayList<>(){{
        add(Math.PI/4);
        add(Math.PI/6);
        add(Math.PI/8);
        add(Math.PI/10);
        add(Math.PI/3);
    }
    };
    List<Point> list2=new ArrayList<>(){{
        add(new Point(3,10));
        add(new Point(12,32));
        add(new Point(25,16));
        add(new Point(41,12));
        add(new Point(22,32));
    }
    };

    @Override
    public int[] checkCopilot() {
        Copilot399 solution=new Copilot399();
        int passCount=0;
        for (int i=0;i<list1.size();i++){
            double angle=list1.get(i);
            Point point=list2.get(i);
            Point res=solution.rotateY(angle, point);
            Point expect=rotate(angle, point);
            if (res.x==expect.x && res.y==expect.y){
                passCount++;
            }
        }

        return new int[]{passCount, list1.size()};
    }

    private static Point rotate(double angle, Point point) {
        double sin = Math.sin(angle);
        double cos = Math.cos(angle);
        int x = (int) Math.round(point.x * cos - point.y * sin);
        int y = (int) Math.round(point.x * sin + point.y * cos);
        return new Point(x, y);
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder399 solution=new Aixcoder399();
        int passCount=0;
        for (int i=0;i<list1.size();i++){
            double angle=list1.get(i);
            Point point=list2.get(i);
            Point res=solution.rotateY(angle, point);
            Point expect=rotate(angle, point);
            if (res.x==expect.x && res.y==expect.y){
                passCount++;
            }
        }

        return new int[]{passCount, list1.size()};
    }
}
