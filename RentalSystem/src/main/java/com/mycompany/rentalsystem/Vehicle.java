package com.mycompany.rentalsystem;
public class Vehicle {
    private int vehicleId;
    private String brand;
    private String model;
    private double rentalRate;
    private boolean isAvailable;

    public Vehicle(int vehicleId, String brand, String model, double rentalRate, boolean isAvailable) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.rentalRate = rentalRate;
        this.isAvailable = isAvailable;
    }

    public int getVehicleId() { 
        return vehicleId; 
    }
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId; 
    }

    public String getBrand() { 
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() { 
        return model; 
    }
    public void setModel(String model) { 
        this.model = model;
    }

    public double getRentalRate() {
        return rentalRate;
    }
    public void setRentalRate(double rentalRate) { 
        this.rentalRate = rentalRate;
    }

    public boolean isAvailable() { 
        return isAvailable; 
    }
    public void setAvailable(boolean available) {
        isAvailable = available; 
    }
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}
