public class NoArgsConsstructor {
    String brand;
    int ram;
    boolean powerOn;
    // explicit default contructor 
    NoArgsConsstructor(){
        brand  = "unknown";
        ram = 8;
        powerOn = false;
    }
    void display(){

            System.out.println(brand + "|ram:" +ram + "GB" + "|Power:" + powerOn);
        }
    }
class Main{
    public static void main(String [] args){
        // new keyword automatically  calls the Constructor that we have  decleare above 
        NoArgsConsstructor l1 = new NoArgsConsstructor();// comnstructor is called here
        l1.display();
    }
}
