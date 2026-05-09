
package com.mycompany.librarymanagement;

/**
 *
 * @author nasir
 */
public class LibraryManagement {
    public static void main(String[] args) {

        // Polymorphism: base type references
        LibraryItem[] items = new LibraryItem[4];

        items[0] = new Book(1, "Java Basics", "John", 2020, "Programming");
        items[1] = new Journal(2, "Science Today", "Dr. Smith", 2023, 5);
        items[2] = new DVD(3, "Inception", "Nolan", 2010, 148);
        items[3] = new Magazine(4, "Tech Monthly", "Alice", 2024, "March");

        // Display all
        System.out.println("--- Items ---");
        for (LibraryItem item : items) {
            item.displayInfo();
        }

        // Checkout (polymorphic calls)
        System.out.println("\n--- Checkout ---");
        for (LibraryItem item : items) {
            item.checkoutItem();
        }

        // After checkout
        System.out.println("\n--- After Checkout ---");
        for (LibraryItem item : items) {
            item.displayInfo();
        }

        // Return one item
        System.out.println("\n--- Return One ---");
        items[0].returnItem();
        items[0].displayInfo();
    }
}