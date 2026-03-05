class Book {
    // instance variables
    private String title;
    private String author;
    private float price;

    // 1️⃣ Default constructor
    public Book() {
        this.title = "Not given";
        this.author = "Not given";
        this.price = 0.0f;
    }

    // 2️⃣ Parameterized constructor (title, author)
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0f;
    }

    // 3️⃣ Parameterized constructor (title, author, price)
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public float getPrice() {
        return this.price;
    }

    // main method
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("You Maya Peerti", "Pawan Poudel");
        Book b3 = new Book("Harayeko Maya", "Nbain Mahatma", 1234);

        System.out.println("Default Constructor:");
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getPrice()); 

        System.out.println("\n2-Parameter Constructor:");
        System.out.println(b2.getTitle());
        System.out.println(b2.getAuthor());
        System.out.println(b2.getPrice());

        System.out.println("\n3-Parameter Constructor:");
        System.out.println(b3.getTitle());
        System.out.println(b3.getAuthor());
        System.out.println(b3.getPrice());
    }
}