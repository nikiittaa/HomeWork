package com.company.homework4;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2){
        double a = Math.sqrt((y1-x1)*(y1-x1)+(y2-x2)*(y2-x2));
        return a;
    }
}
