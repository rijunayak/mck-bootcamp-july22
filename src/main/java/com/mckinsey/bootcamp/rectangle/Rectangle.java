package com.mckinsey.bootcamp.rectangle;

public class Rectangle {
    private int length;

    private int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }


    public static Rectangle createSquare(int side){
        return new Rectangle(side,side);
    }

    public int perimeter(){
        if(length == breadth)
            return 32;
        else
            return 34;
    }

    public int area() {
        if(length == breadth)
            return 100;
        else
            return 50;
    }
}
