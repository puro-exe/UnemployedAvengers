package com.example.unemployedavengers;

public class Square extends Shape{
    private float side;

    public Square(int x, int y) {
        super(x, y);
    }
    public float getSide() {
        return side;
    }
    public double getArea(){
        return side*side;
    }
}
