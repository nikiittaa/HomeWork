package com.company.homework4.Homework6;

public class Train extends Transport {
    int carriage = 22;
    final int peoples = 40;

    public Train(String name,int weight,int speed) {
        super(name, weight, speed);
    }

    public void passengerTrain() {
        System.out.println("It carries " + peoples * carriage + " peoples ");
    }

    @Override
    public void printTransport() {
        super.printTransport();
    }
}
