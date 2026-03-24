/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiclerentalsystem;

/**
 *
 * @author vlackfie
 */
import java.util.Scanner;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        RentalSystem system = new RentalSystem();

        // Add sample vehicles
        system.addVehicle(new Car("Toyota", "Corolla", 3000));
        system.addVehicle(new Bike("Yamaha", "R15", 1000));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Vehicle Rental System ---");
            System.out.println("1. Show Available Vehicles");
            System.out.println("2. Rent Vehicle");
            System.out.println("3. Return Vehicle");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> system.showAvailableVehicles();

                case 2 -> {
                    System.out.print("Enter vehicle index: ");
                    int rentIndex = sc.nextInt();
                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();
                    system.rentVehicle(rentIndex, days);
                }

                case 3 -> {
                    System.out.print("Enter vehicle index: ");
                    int returnIndex = sc.nextInt();
                    system.returnVehicle(returnIndex);
                }

                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}