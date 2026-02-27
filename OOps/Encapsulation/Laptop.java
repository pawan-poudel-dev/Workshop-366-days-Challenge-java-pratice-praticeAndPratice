public class Laptop {
    private String brand;
    private double price;
    public void setBrand(String brand){
        this.brand= brand;
    }
    public void setPrice(double price){
        if(price <30000){
            System.out.println("Sorry!! price cannot be Receed less than 30,0000");
            this.price=400000;
        }else{
            this.price = price;
        }
    }
    public String getBrand(){
        return brand;
    }
    public double getPrice(){
        return price;
    }
    
}
