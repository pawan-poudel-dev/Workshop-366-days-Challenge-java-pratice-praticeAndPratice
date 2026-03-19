public class Bicycle {
    // state and field
    private int gear= 5;
    public void braking(){
        System.out.println("Working of break");
    }
    public static void main(String [] args){
        Bicycle by = new Bicycle();
        by.braking();
    }
}
