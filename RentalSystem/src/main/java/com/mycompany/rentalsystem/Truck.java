package com.mycompany.rentalsystem;
public class Truck extends Vehicle{
    private double payloadCapacity;

    public Truck(int vehicleId, String brand, String model, double rentalRate, boolean isAvailable, double payloadCapacity) {
        super(vehicleId, brand, model, rentalRate, isAvailable);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + (payloadCapacity * 20);
    }
}
