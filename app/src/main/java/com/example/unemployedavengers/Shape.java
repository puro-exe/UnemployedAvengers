package com.example.unemployedavengers;

public abstract class Shape {
    String color = "red";
    protected int x;
    protected int y;

    public Shape(int x, int y,String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

}
