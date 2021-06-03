package com.company.homework6.transport;

public class Train extends Transport {
    int carriage;
    int peoples;

    public Train(String name,int weight,int speed) {
        super(name, weight, speed);
        carriage = 22;
        peoples = 40;
    }

    public void passengerTrain() {
        System.out.println("It carries " + peoples * carriage + " peoples ");
    }

}
