
package com.mycompany.rentalservice;


public class Vehicle {
    private String vehicleId;
    private String brand;
    private String model;
    private double rentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String brand, String model, double rentalRate, boolean isAvailable) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.rentalRate = rentalRate;
        this.isAvailable = isAvailable;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}