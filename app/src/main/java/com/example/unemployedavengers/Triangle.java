package com.example.unemployedavengers;

public class Triangle extends Shape {

    public Triangle(int x, int y) {
        super(x, y);
        this.color = "Blue";
    }

    @Override
    public double getArea() {return 0.5f*x*y;}//gets the area of the triangle


}