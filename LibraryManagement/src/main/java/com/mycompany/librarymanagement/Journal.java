
package com.mycompany.librarymanagement;

/**
 *
 * @author nasir
 */
class Journal extends LibraryItem {
    private int issueNumber;

    public Journal(int id, String title, String editor, int year, int issueNumber) {
        super(id, title, editor, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public void checkoutItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Journal issued (Issue " + issueNumber + "): " + getTitle());
        } else {
            System.out.println("Journal not available!");
        }
    }
}