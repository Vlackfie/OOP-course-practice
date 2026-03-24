/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclerentalsystem;

/**
 *
 * @author vlackfie
 */
public class CustomersDetails {
    private String name;
    private int id;

    public CustomersDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Customer: " + name + " | ID: " + id);
    }
}