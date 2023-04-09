package com.clay.designp.iterator;

import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        library.addBook(new Book("1984", "George Orwell", 1949));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));

        // Iterate over the books using a for-each loop
        for (Book book : library) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
            System.out.println("---------------------");
        }
        System.out.println("*************************************************");
        // Iterate over the books using an explicit Iterator
        Iterator<Book> iterator = library.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getTitle() + " by " + book.getAuthor());
            System.out.println("---------------------");
        }

    }
}
