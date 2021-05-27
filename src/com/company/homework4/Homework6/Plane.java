package com.company.homework4.Homework6;

public class Plane extends Transport {
    final int peoples = 140;

    public Plane(String name,int weight,int speed) {
        super(name, weight, speed);
    }
    public void passengerPlane() {
        System.out.println("It carries " + peoples + " peoples ");
    }

    @Override
    public void printTransport() {
        super.printTransport();
    }
}


