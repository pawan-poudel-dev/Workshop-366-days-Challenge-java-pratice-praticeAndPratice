class Book {
    String title;
    String author;
    double price;
    int    pages;

    // Constructor 1: no-arg — sets all defaults
    Book() {
        title  = 
"Unknown";
        author = "Unknown";
        price  = 0.0;
        pages  = 0;
    }

    // Constructor 2: title and author only
    Book(String title, String author) {
        
this.title  = title;
        this.author = author;
        price = 200.0;  // default price
        pages = 100;   // default pages
    }

    // Constructor 3: all four fields
    Book(String title, String author, double price, int pages) {
        
this.title  = title;
        this.author = author;
        this.price  = price;
        this.pages  = pages;
    }

    void display() {
        System.out.printf("%-20s %-15s ₹%.0f  %d pages%n", title, author, price, pages);
    }
}
class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java OOP", "Kathy Sierra");
        Book b3 = new Book("Clean Code", "R.Martin", 499.0, 464);
        b1.display(); b2.display(); b3.display();
    }
}