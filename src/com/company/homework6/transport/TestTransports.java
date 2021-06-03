package com.company.homework6.transport;

public class TestTransports {
    public static void main(String[] args) {

        Train train = new Train("Train",150,100);
        train.printTransport();
        train.passengerTrain();

        Plane plane = new Plane("Plane",45,900);
        plane.printTransport();
        plane.passengerPlane();
    }
}
