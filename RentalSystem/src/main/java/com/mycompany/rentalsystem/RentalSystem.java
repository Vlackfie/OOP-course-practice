package com.mycompany.rentalsystem;
public class RentalSystem {

    public static void main(String[] args) {
       
        Vehicle car = new Car(1, "Toyota", "Corolla", 50, true, 4);
        Vehicle bike = new Motorcycle(2, "Yamaha", "R15", 20, true, true);
        Vehicle truck = new Truck(3, "Volvo", "FH", 100, true, 10);
        int days = 3;
        System.out.println("Car Rental Cost: " + car.calculateRentalCost(days));
        System.out.println("Motorcycle Rental Cost: " + bike.calculateRentalCost(days));
        System.out.println("Truck Rental Cost: " + truck.calculateRentalCost(days));
    }
}
