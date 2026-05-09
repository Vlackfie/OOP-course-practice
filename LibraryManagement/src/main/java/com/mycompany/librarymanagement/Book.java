
package com.mycompany.librarymanagement;

/**
 *
 * @author nasir
 */

class Book extends LibraryItem {
    private String genre;

    public Book(int id, String title, String author, int year, String genre) {
        super(id, title, author, year);
        this.genre = genre;
    }

    @Override
    public void checkoutItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book issued: " + getTitle());
        } else {
            System.out.println("Book not available!");
        }
    }
}