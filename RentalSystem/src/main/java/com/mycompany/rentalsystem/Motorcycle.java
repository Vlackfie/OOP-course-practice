package com.mycompany.rentalsystem;
public class Motorcycle extends Vehicle {
    private boolean hasHelmet;

    public Motorcycle(int vehicleId, String brand, String model, double rentalRate, boolean isAvailable, boolean hasHelmet) {
        super(vehicleId, brand, model, rentalRate, isAvailable);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getRentalRate() * days;
        if (hasHelmet) {
            cost += 5 * days;
        }
        return cost;
    }
}
