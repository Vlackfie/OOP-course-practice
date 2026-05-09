package com.mycompany.rentalsystem;
public class Car  extends Vehicle {
     private int numberOfDoors;

    public Car(int vehicleId, String brand, String model, double rentalRate, boolean isAvailable, int numberOfDoors) {
        super(vehicleId, brand, model, rentalRate, isAvailable);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + (numberOfDoors * 10);
    }
}
