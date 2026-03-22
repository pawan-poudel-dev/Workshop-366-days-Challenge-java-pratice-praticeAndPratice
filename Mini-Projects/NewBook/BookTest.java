import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating books
        Book[] libraryBooks = new Book[3];
        libraryBooks[0] = new Book("The Hitchhiker's Guide", "Douglas Adams", 23.99, false);
        libraryBooks[1] = new Book("1984", "George Orwell", 45.67, false);
        libraryBooks[2] = new Book("The Born Child", "Arjun Prasad", 56.00, false);

        while (true) {

            // Menu
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Display all books");
            System.out.println("2. Issue a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            // Safe integer input for menu
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // discard bad input
                continue;
            }

            int choice = sc.nextInt();

            if (choice == 1) {
                // Display all books
                for (int i = 0; i < libraryBooks.length; i++) {
                    System.out.println("\nIndex: " + i);
                    libraryBooks[i].displayBooks();
                }

            } else if (choice == 2) {
                // Issue book
                System.out.print("Enter book index (0 to " + (libraryBooks.length - 1) + "): ");

                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
                    sc.next();
                    continue;
                }

                int i = sc.nextInt();
                if (i >= 0 && i < libraryBooks.length) {
                    libraryBooks[i].issued();
                } else {
                    System.out.println("Invalid index. Please enter a value between 0 and " + (libraryBooks.length - 1) + ".");
                }

            } else if (choice == 3) {
                // Return book
                System.out.print("Enter book index (0 to " + (libraryBooks.length - 1) + "): ");

                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
                    sc.next();
                    continue;
                }

                int i = sc.nextInt();
                if (i >= 0 && i < libraryBooks.length) {
                    libraryBooks[i].returnBook();
                } else {
                    System.out.println("Invalid index. Please enter a value between 0 and " + (libraryBooks.length - 1) + ".");
                }

            } else if (choice == 4) {
                System.out.println("Exiting program...");
                break;

            } else {
                System.out.println("Invalid choice. Please select 1–4.");
            }
        }

        sc.close();
    }
}