package com.example.unemployedavengers;
public class Rhom extends Shape {
    public Pentagon(int x, int y) {
        super(x, y);
        this.color = "Purple";
    }
    @Override
    public double getArea() {
        return (x*y)/2;
    }
}