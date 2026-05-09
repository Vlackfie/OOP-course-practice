
package com.mycompany.librarymanagement;

/**
 *
 * @author nasir
 */
class Magazine extends LibraryItem {
    private String month;

    public Magazine(int id, String title, String editor, int year, String month) {
        super(id, title, editor, year);
        this.month = month;
    }

    @Override
    public void checkoutItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Magazine issued (" + month + "): " + getTitle());
        } else {
            System.out.println("Magazine not available!");
        }
    }
}