package org.etsntesla.it;

import org.etsntesla.it.math.Point;

public class Main {
    public static void main(String[] args){
        Point t1=new Point(3.0d,4.0d);
        Point t2=new Point(3.0d,6.0d);

        double x=t1.radius();
        System.out.println(x);

        double y=t2.distance(t1);
        System.out.println(y);

        double z=t1.distance(3,6);
        System.out.println(z);
    }
}
