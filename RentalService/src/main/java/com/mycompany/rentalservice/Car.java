
package com.mycompany.rentalservice;


public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String vehicleId, String brand, String model, double rentalRate, boolean isAvailable,
            int numberOfDoors) {
        super(vehicleId, brand, model, rentalRate, isAvailable);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 50;
    }
}