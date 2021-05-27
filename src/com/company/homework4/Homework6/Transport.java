package com.company.homework4.Homework6;

public class Transport {
    private String name;
    private int weight;
    private int speed;

    public void Transport() {
        this.weight = 27000;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printTransport(){
        System.out.println("Transport: " + name + ". Weight: " + weight + " ton and speed: " + speed + " km.");
    }

}
