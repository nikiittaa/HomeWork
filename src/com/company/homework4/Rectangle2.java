package com.company.homework4;

public class Rectangle2 {
    public static void main(String[] args) {
        Rectangle rectangle0 = new Rectangle(5,5,5);
        System.out.println(rectangle0.toString());
        //
        Rectangle rectangle1 = new Rectangle(5,5,5,5);
        System.out.println(rectangle1.toString());

        Rectangle rectangle2 = new Rectangle(rectangle1);
        System.out.println(rectangle2.toString());
    }
}
