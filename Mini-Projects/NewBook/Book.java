public class Book {
    private String bookTitle;
    private String authorName;
    private double price;
    private boolean isIssued;

    // Default constructor
    public Book() {
        this.bookTitle = "Unknown";
        this.authorName = "Unknown";
        this.price = 0;
        this.isIssued = false;
    }

    // Parameterized constructor
    public Book(String bookTitle, String authorName, double price, boolean isIssued) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.isIssued = isIssued;
    }

    // Getters
    public String getBookTitle() { return bookTitle; }
    public String getAuthorName() { return authorName; }
    public double getPrice() { return price; }
    public boolean isIssued() { return isIssued; }

    // Issue the book
    public void issued() {
        if (isIssued) {
            System.out.println("Book is already issued.");
        } else {
            isIssued = true;
            System.out.println("Book issued successfully.");
        }
    }

    // Return the book
    public void returnBook() {
        if (!isIssued) {
            System.out.println("Book was not issued.");
        } else {
            isIssued = false;
            System.out.println("Book returned successfully.");
        }
    }

    // Display book details
    public void displayBooks() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author:     " + authorName);
        System.out.println("Price:      $" + String.format("%.2f", price));
        System.out.println("Status:     " + (isIssued ? "Issued" : "Available"));
    }
}