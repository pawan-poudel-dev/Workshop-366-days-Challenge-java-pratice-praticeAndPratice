public class Book {

    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public void borrowBook() {

        if (isAvailable == true) {
            isAvailable = false;
            System.out.println("Book Borrowed Successfully");
        } 
        else {
            System.out.println("Book not available");
        }

    }

    public void returnBook() {

        if (isAvailable == false) {
            isAvailable = true;
            System.out.println("Book returned successfully");
        } 
        else {
            System.out.println("Book already available");
        }

    }

    public String displayBook() {

        return "Title: " + title + "\nAuthor: " + author + "\nAvailable: " + isAvailable;

    }

}

class Main {

    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", "Shirram Neupane", true);
        Book b2 = new Book("Python Fundamentals", "Poudel Sarkar", false);

        Book[] books = {b1, b2};

        for (Book book : books) {
            System.out.println(book.displayBook());
            System.out.println();
        }

        b1.borrowBook();
        b2.borrowBook();

        b2.returnBook();

    }

}