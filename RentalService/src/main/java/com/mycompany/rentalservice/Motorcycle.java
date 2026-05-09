
package com.mycompany.rentalservice;

public class Motorcycle extends Vehicle {
    private boolean hasHelmet;

    public Motorcycle(String vehicleId, String brand, String model, double rentalRate, boolean isAvailable,
            boolean hasHelmet) {
        super(vehicleId, brand, model, rentalRate, isAvailable);
        this.hasHelmet = hasHelmet;
    }

    public boolean isHasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}