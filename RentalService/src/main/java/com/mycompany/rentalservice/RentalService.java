

package com.mycompany.rentalservice;


public class RentalService {
    public static void main(String[] args) {

        Car car = new Car("V001", "Toyota", "Corolla", 1000, true, 4);
        Motorcycle bike = new Motorcycle("V002", "Yamaha", "R15", 500, true, true);
        Truck truck = new Truck("V003", "Volvo", "FH", 2000, true, 5);

        Vehicle[] vehicles = { car, bike, truck };

        int days = 3;

        for (Vehicle v : vehicles) {
            System.out.println(v.calculateRentalCost(days));
        }
    }
}