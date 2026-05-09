
package com.mycompany.librarymanagement;

/**
 *
 * @author nasir
 */

class DVD extends LibraryItem {
    private int durationMinutes;

    public DVD(int id, String title, String director, int year, int durationMinutes) {
        super(id, title, director, year);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public void checkoutItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD issued: " + getTitle() + " (" + durationMinutes + " mins)");
        } else {
            System.out.println("DVD not available!");
        }
    }
}