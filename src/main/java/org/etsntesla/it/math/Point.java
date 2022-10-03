package org.etsntesla.it.math;

import static java.lang.Math.*;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(){

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double radius(){
        return sqrt(x*x+y*y);
    }

    public double distance(Point z){
        return sqrt(pow(this.x-z.x,2)+pow(y-z.y,2));
    }

    public double distance(double a, double b){
        return sqrt(pow(x-a,2)+pow(y-b,2));
    }
}
