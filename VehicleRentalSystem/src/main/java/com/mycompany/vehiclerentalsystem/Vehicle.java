/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclerentalsystem;

/**
 *
 * @author vlackfie
 */
abstract class Vehicle {
    protected String brand;
    protected String model;
    protected double rentPerDay;
    protected boolean available;

    public Vehicle(String brand, String model, double rentPerDay) {
        this.brand = brand;
        this.model = model;
        this.rentPerDay = rentPerDay;
        this.available = true;
    }

    // Abstract method (polymorphism)
    public abstract double calculateRent(int days);

    public void display() {
        System.out.println(brand + " " + model + " | Rent/day: " + rentPerDay + " | Available: " + available);
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailability(boolean status) {
        available = status;
    }
}
