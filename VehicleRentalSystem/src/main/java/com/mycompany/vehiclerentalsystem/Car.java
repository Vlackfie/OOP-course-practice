/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclerentalsystem;

/**
 *
 * @author vlackfie
 */
class Car extends Vehicle {

    public Car(String brand, String model, double rentPerDay) {
        super(brand, model, rentPerDay);
    }

    @Override
    public double calculateRent(int days) {
        return days * rentPerDay;
    }
}