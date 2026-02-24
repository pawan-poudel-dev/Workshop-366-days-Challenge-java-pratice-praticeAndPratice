public class Book {
    String title;
    float  price;
    Book( String title, float price){
        this.title = title;
        this.price= price;
    }
void showBook(){
    System.out.println("The title of the book is: " + title +  " "+ "price is : "+ price);
}
public static void main (String [] args){
    
    Book obj = new Book("SeroFero",1323);
    
    Book obj1 = new Book("yo man ko kura haru",1234);

    
    obj.showBook();
    obj1.showBook();
}
    
}
