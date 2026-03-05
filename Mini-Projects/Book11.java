public class Book11 {

    private String title;
    private String author;
    private boolean isAvailable;

    public Book11(String title, String author, boolean isAvailable) {
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

class Tution{

    public static void main(String[] args) {

        Book11 b1 = new Book11("Java Basics", "Shirram Neupane", true);
        Book11 b2 = new Book11("Python Fundamentals", "Poudel Sarkar", false);

        Book11[] books = {b1, b2};

        for (Book11 book : books) {
            System.out.println(book.displayBook());
            System.out.println();
        }

        b1.borrowBook();
        b2.borrowBook();

        b2.returnBook();

    }

}