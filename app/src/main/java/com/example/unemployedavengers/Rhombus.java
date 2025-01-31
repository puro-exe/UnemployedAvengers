package com.example.unemployedavengers;
public class Rhombus extends Shape {
    public Rhombus(int x, int y) {
        super(x, y);
    }
    @Override
    public double getArea() {
        return (x*y)/2;
    }
}