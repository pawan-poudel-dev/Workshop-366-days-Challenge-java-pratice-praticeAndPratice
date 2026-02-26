public class Car extends Veichle {
    @Override
    public void move(){
        super.move();
        System.out.println("car is running");
    }
    public  static void main(String [] args){
        Veichle obj = new Car();
        obj.move();

    }




}

    

