package com.company.homework4.Homework6;

public class Plane extends Transport {
    final int peoples = 140;

    public void passengerPlane() {
        System.out.println("It carries " + peoples + " peoples ");
    }

    @Override
    public void printTransport() {
        super.printTransport();
    }
}


