package com.company.homework4.Homework6;

public class TestTransports {
    public static void main(String[] args) {
        Train train = new Train();
        train.setName("Train");
        train.setSpeed(100);
        train.setWeight(150);

        train.printTransport();
        train.passengerTrain();

        Plane plane = new Plane();
        plane.setName("Plane");
        plane.setSpeed(900);
        plane.setWeight(45);

        plane.printTransport();
        plane.passengerPlane();
    }
}
