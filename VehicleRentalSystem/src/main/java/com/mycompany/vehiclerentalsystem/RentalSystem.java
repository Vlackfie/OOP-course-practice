/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclerentalsystem;

/**
 *
 * @author vlackfie
 */
import java.util.ArrayList;

class RentalSystem {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void showAvailableVehicles() {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).isAvailable()) {
                System.out.print("[" + i + "] ");
                vehicles.get(i).display();
            }
        }
    }

    public void rentVehicle(int index, int days) {
        if (index >= 0 && index < vehicles.size()) {
            Vehicle v = vehicles.get(index);

            if (v.isAvailable()) {
                double cost = v.calculateRent(days);
                v.setAvailability(false);

                System.out.println("Vehicle rented successfully!");
                System.out.println("Total cost: " + cost);
            } else {
                System.out.println("Vehicle not available.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void returnVehicle(int index) {
        if (index >= 0 && index < vehicles.size()) {
            vehicles.get(index).setAvailability(true);
            System.out.println("Vehicle returned successfully!");
        } else {
            System.out.println("Invalid index.");
        }
    }
}