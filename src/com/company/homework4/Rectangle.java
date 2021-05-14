package com.company.homework4;

public class Rectangle {
    int top;
    int width;
    int height;
    int left;

    //1
    Rectangle(int left, int width, int height, int top) {
        this.left = left;
        this.width = width;
        this.height = height;
        this.top = top;
    }

    //2
    Rectangle(int left, int top) {
        this.height = 0;
        this.width = 0;
        this.left = left;
        this.top = top;
    }

    //3
    Rectangle(int left, int width, int top) {
        this.height = width;
        this.left = left;
        this.top = top;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "top=" + top +
                ", width=" + width +
                ", height=" + height +
                ", left=" + left +
                '}';
    }

    Rectangle(Rectangle r) {
        this.top = r.top;
        this.left = r.left;
        this.width = r.width;
        this.height = r.height;
    }

}
