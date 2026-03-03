public class Book {
    //initialize  instance variable 
    //   use of the encapsulation for the data hiding 
    // using of private Access modifier and  use of getter and setter method 
    private  String title;
    private String author;
    private String  ISBN;
    private int publicationYear;
    private String genre;
    private  boolean isAvailable;

//  paramaterized constructor created and pass the paramenters and use  this keyword to  refer the current object 
    Book( String title,String author,String ISBN, int publicationYear,String genre, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    // Now, initialize the getter method to return the value
    public String getTitle(){
        return title;

    }
    public String getAuthor(){
        return author;

    }
    public String getISBN(){
        return ISBN;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
    public String getgenre(){
        return genre;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public  void displayInfo(){
        System.out.println("Title::" + title);
        System.out.println("Author:" + author);
        System.out.println("ISBN:" + ISBN);
        System.out.println("Publication year:" + publicationYear);
        System.out.println("Genre:" + genre);
        System.out.println("Availability Status:" + isAvailable);

        }

}

class BookTest{
    public static void main(String [] args){
        Book b1= new Book("Hariyo Bahn","Mr.jadajish punghani","1122",2004,"Fiction",true);
        Book b2 = new Book("The Hero" ,"Pawan poudel","2345",2006,"Fantasy", true);
        Book b3 = new Book("Ancient World", "Ram Bahadur", "ISBN003", 1980, "History", false);
Book [] books = {b1,b2,b3};
System.out.println("====================Available Books ============================");
for(Book book:books){
    if(book.isAvailable()){
        book.displayInfo();
    }
}
System.out.println("====================Not Available Books ==============================");
for(Book book:books){
    if(!book.isAvailable()){
        book.displayInfo();

    }
}
System.out.println("=================Available and published After 2000");
for(Book book: books){
    if(book.isAvailable()&& book.getPublicationYear() >2000){
        book.displayInfo();

    }
    }
    }
    }
// bY the way  learning  java is fun 