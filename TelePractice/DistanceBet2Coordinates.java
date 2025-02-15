package Java.TelePractice;

import java.awt.*;

public class DistanceBet2Coordinates {
    public static void main(String[] args) {
        Point1 ob1 = new Point1(-3, -5);
        Point2 ob2 = new Point2(-3, -7);
        double dis = Math.pow((ob1.x- ob2.a), 2) + Math.pow((ob1.y-ob2.b), 2);
        System.out.println((int)Math.sqrt(dis));

    }
}
class Point1{
    int x;
    int y;
    Point1(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class  Point2{
    int a;
    int b;
    Point2(int x , int y){
        this.a = x;
        this.b = y;
    }
}
