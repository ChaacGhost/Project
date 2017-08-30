package com.classes;

public class Triangle extends HeritageAndPoly {
    double area;
    @Override
    public void calculateArea(double base, double height){
        area = (base*height)/2;
    }
    @Override
    public double getArea() {
        return area;
    }
}
