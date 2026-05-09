
package com.mycompany.librarymanagement;

/**
 *
 * @author sadikul
 */
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author; // editor for journals/magazines, director for DVD
    private int publicationYear;
    protected boolean isAvailable;

    public LibraryItem(int itemId, String title, String author, int publicationYear) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    // Getters
    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }
    public boolean isAvailable() { return isAvailable; }

    // Polymorphism (must be overridden)
    public abstract void checkoutItem();

    // Common behavior
    public void returnItem() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " returned.");
        } else {
            System.out.println(title + " is already in library.");
        }
    }

    public void displayInfo() {
        System.out.println(itemId + " | " + title + " | " + author +
                " | " + publicationYear + " | Available: " + isAvailable);
    }
}
