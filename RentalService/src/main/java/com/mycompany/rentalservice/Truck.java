
package com.mycompany.rentalservice;

public class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String vehicleId, String brand, String model, double rentalRate, boolean isAvailable,
            double payloadCapacity) {
        super(vehicleId, brand, model, rentalRate, isAvailable);
        this.payloadCapacity = payloadCapacity;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + (payloadCapacity * 10);
    }
}