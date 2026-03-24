/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclerentalsystem;

/**
 *
 * @author vlackfie
 */
class Bike extends Vehicle {

    public Bike(String brand, String model, double rentPerDay) {
        super(brand, model, rentPerDay);
    }

    @Override
    public double calculateRent(int days) {
        return days * rentPerDay * 0.9; // 10% discount
    }
}
