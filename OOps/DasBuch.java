class DasBuch{
  String title;
  int price;
  public void bookDetails(){
    System.out.println("The title of the book is : " + title + "And the price of the book is: "+ price);
  }

  public static void main(String [] args){
    DasBuch book1 = new DasBuch();
    book1.title = "yo man ko kura";
    book1.price = 2000;
    DasBuch book2 = new DasBuch();
    book2.title = "samaya ko Mahatto";
    book2.price = 4500;


book1.bookDetails();
book2.bookDetails();



  }  
}