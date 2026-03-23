// concept of the constructor overloading 

public class Buch {
    String title;
    String author;
    double price;
    int pages;
    // constructor 1 - no args constructor 
    Buch(){
        title = "unknown";
        author = "unknown";
        price = 0.0;
        pages = 0;
    }
    // constructor 2: title and author only 
     Buch (String title, String author){
        this.title = title;
        this.author= author;
        price = 400;// default price 
        pages = 100;// default pages 

     }
     // constructor 3 : all four fields 
     Buch(String title, String author, double price, int pages){
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;

     }
     void display(){
    System.out.println("Title:" + title +
            "Author:" + author+
            "Price: "+ price+
            "pages:" + pages);
        
     }

    
}
 class BuchTest{
     public static void main(String [] args){
        Buch b1  = new Buch();
        Buch b2 = new Buch("Java OOP","Kathy Sierra");
        Buch b3 = new Buch("Clean code", "R.Martin" ,499,564);
        b1.display();
        b2.display();
        b3.display();
     }

}