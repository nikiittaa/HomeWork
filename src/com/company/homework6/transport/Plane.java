package com.company.homework6.transport;

public class Plane extends Transport {
    int peoples;

    public Plane(String name,int weight,int speed) {
        super(name, weight, speed);
        peoples = 140;
    }
    public void passengerPlane() {
        System.out.println("It carries " + peoples + " peoples ");
    }

}


