package com.company.homework6.transport;

public class Transport {
    private String name;
    private int weight;
    private int speed;

    public Transport(String name,int weight,int speed) {
        this.weight = weight;
        this.name = name;
        this.speed = speed;
    }

    public void printTransport(){
        System.out.println("Transport: " + name + ". Weight: " + weight + " ton and speed: " + speed + " km.");
    }

}
