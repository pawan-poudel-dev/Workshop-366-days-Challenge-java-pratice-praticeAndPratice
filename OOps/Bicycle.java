public class Bicycle {
    // state or field of the bicycle
    private int gear = 5;
    //method or brhaviour of the bicycle
    public void breaking(){
        System.out.println("Working of braking.");
    }}
    class BicycleTest{
        public static void main(String []args){
            Bicycle touringBicycle = new Bicycle();
            touringBicycle.breaking();
}
}
