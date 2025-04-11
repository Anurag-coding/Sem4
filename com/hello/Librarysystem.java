package com.hello;
public class Librarysystem {
    public static void main(String[] args) {
        Book book = new Book("The Guide", "R.K NARAYAN", 309);
        Magazine magazine = new Magazine("Godaan", "PREMCHAND", "January 1936");
        DVD dvd = new DVD("Tulsi Dohawali", "TULSIDAS", 88);

        System.out.println("Library Resources:\n");
        book.displayDetails();
        System.out.println();
        magazine.displayDetails();
        System.out.println();
        dvd.displayDetails();
    }
}
