package com.xworkz.train_passengers;

import com.xworkz.train_passengers.passenger.Passenger;
import com.xworkz.train_passengers.train.Train;

public class TrainPassengerTester {
    public static void main(String[] args) {
        Train train = new Train();
        Passenger passenger = new Passenger();
        train.passenger = passenger;
    }
}
