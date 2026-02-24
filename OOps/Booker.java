public class Booker {
    private String name;
    private double price;
    private String author;
    // no -argument constructor examle 
    Booker(){
        this.name = "Yo man ko halchal";
        this.price = 23445d;
        this.author = "Harichandra mahathma";
    }
    public String getName(){
        return this.name;
    }
     public double getPrice(){
        return this.price;
     }
     public String getAuthor(){
        return this.author;
     }
    
}
