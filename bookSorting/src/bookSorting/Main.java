package bookSorting;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// Book objects
        Book book1 = new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", "1925");
        Book book2 = new Book("Pride and Prejudice", 200, "Jane Austen", "1813");
        Book book3 = new Book("To Kill a Mockingbird", 280, "Harper Lee", "1960");
        Book book4 = new Book("Animal Farm", 150, "George Orwell", "1945");
        Book book5 = new Book("1984", 220, "George Orwell", "1949");

        // Set to store book objects sorted by name
        Set<Book> bookSet = new TreeSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        System.out.println("Books sorted by name: ");
        for (Book book : bookSet) {
            System.out.println(book);
        }

        // Set to store book objects sorted by page count
        Set<Book> bookPagesSet = new TreeSet<>(new BookPagesComparator());
        bookPagesSet.add(book1);
        bookPagesSet.add(book2);
        bookPagesSet.add(book3);
        bookPagesSet.add(book4);
        bookPagesSet.add(book5);

        System.out.println("\nBooks sorted by page count: ");
        for (Book book : bookPagesSet) {
            System.out.println(book);
        }
	}

}
