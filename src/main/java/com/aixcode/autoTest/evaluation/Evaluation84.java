package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Evaluation84 extends AbstractBaseEvaluation {
    List<Double> list1=new ArrayList<>(){{
        add(Math.PI/4);//45度
        add(Math.PI/6);//30度
        add(0d);// 0度
        add(Math.PI);//180度
        add(Math.PI/3);//60
        add(Math.PI/8);//180度
    }
    };
    List<Point> list2=new ArrayList<>(){{
        add(new Point(3,0));//x轴上的点
        add(new Point(12,32));
        add(new Point(25,16));
        add(new Point(41,12));
        add(new Point(22,32));
        add(new Point(0,12));//Y轴上的点
    }
    };

    public Evaluation84(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    private static Point rotate(double angle, Point point) {
        double sin = Math.sin(angle);
        double cos = Math.cos(angle);
        int x = (int) Math.round(point.x * cos - point.y * sin);
        int y = (int) Math.round(point.x * sin + point.y * cos);
        return new Point(x, y);
    }

    @Override
    public int[] evaluation() {
        int passCount=0;
        for (int i=0;i<list1.size();i++){
            try {
                double angle=list1.get(i);
                Point point=list2.get(i);
                Point res=solution.rotateY(angle, point);
                Point expect=rotate(angle, point);
                if (res.x==expect.x && res.y==expect.y){
                    passCount++;
                }
            }catch (Exception e){

            }

        }
        return new int[]{passCount, list1.size()};
    }
}
