
package com.mycompany.shoping;

import com.mycompany.onlineshop.Electronics;
import com.mycompany.onlineshop.Cloth;
import com.mycompany.onlineshop.Book;

public class Shoping {
    public static void main(String[] args) {

        Electronics el1 = new Electronics(1, "Mobile", 50000, 2, 30);
        Cloth ch1 = new Cloth(2, "lehenga", 5000, 10, "xl");
        Book book1 = new Book(3, "Harry Potter", 420, 12, "Jannat");

        // Display details
        System.out.println("Electronics: " + el1.getProductName());
        System.out.println("Shipping Cost: " + el1.calculateShippingCost());

        System.out.println("\nClothing: " + ch1.getProductName());
        System.out.println("Shipping Cost: " + ch1.calculateShippingCost());

        System.out.println("\nBook: " + book1.getProductName());
        System.out.println("Shipping Cost: " + book1.calculateShippingCost());
    }
}