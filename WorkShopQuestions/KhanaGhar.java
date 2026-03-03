public class KhanaGhar {
    private String itemName;
    private double price;
    private  String category;
    private boolean isVegetarian;
    private boolean isAvailable;
    // paramaterized constructor
    KhanaGhar( String itemName,double price,String category,boolean isVegetarian,boolean isAvailable){
    this.itemName = itemName;
    this.price = price;
    this.category = category;
    this.isVegetarian = isVegetarian;
    this.isAvailable = isAvailable;


    }
    // we  must have to  decleare getter to read and access the private access modifiers used in instance variable 
    public String getItem(){
        return itemName;

    }
    public double getPrice(){
        return price;
    }
     public String getCategory(){
        return category;
     }
      public boolean isVegetarian(){
        return isVegetarian;
      }
      public boolean isAvailable(){
        return isAvailable;

      }
     public void displayInfo(){
        System.out.printf("%-25s Rs.%-8.2f %-15s %-10s %-10s\n",
                itemName,
                price,
                category,
                (isVegetarian ? "Veg" : "Non-Veg"),
                (isAvailable ? "Available" : "Not Available"));
    }
}

class KhanaGharTest {

    public static void main(String[] args){

        KhanaGhar k1 = new KhanaGhar("Dal-Bhat Set",120,"Dal-Bhat",true,true);
        KhanaGhar k2 = new KhanaGhar("Masala Chiya",15,"Chiya-Nasta",true,true);
        KhanaGhar k3 = new KhanaGhar("Dharane Kalo Bangur",400,"Special",false,false);
        KhanaGhar k4 = new KhanaGhar("Sekuwa",200,"BBQ",false,true);

        KhanaGhar[] menu = {k1,k2,k3,k4};

        System.out.println("==============================================================");
        System.out.println("             🍛 Welcome to KHANA GHAR – Dharan 🍛            ");
        System.out.println("==============================================================");
        System.out.printf("%-25s %-10s %-15s %-10s %-10s\n",
                "Item Name","Price","Category","Type","Status");
        System.out.println("--------------------------------------------------------------");

        for(KhanaGhar item : menu){
            item.displayInfo();
        }

        // Vegetarian only
        System.out.println("\n===== Vegetarian Items Only =====");
        for(KhanaGhar item : menu){
            if(item.isVegetarian()){
                item.displayInfo();
            }
        }

        // Non-Vegetarian only
        System.out.println("\n===== Non-Vegetarian Items Only =====");
        for(KhanaGhar item : menu){
            if(!item.isVegetarian()){
                item.displayInfo();
            }
        }

        // Non-veg >100 and available
        System.out.println("\n===== Non-Veg > Rs.100 & Available =====");
        for(KhanaGhar item : menu){
            if(!item.isVegetarian() &&
               item.getPrice() > 100 &&
               item.isAvailable()){
                item.displayInfo();
            }
        }

        // Veg <50 and available
        System.out.println("\n===== Veg < Rs.50 & Available =====");
        for(KhanaGhar item : menu){
            if(item.isVegetarian() &&
               item.getPrice() < 50 &&
               item.isAvailable()){
                item.displayInfo();
            }
        }
    }
}