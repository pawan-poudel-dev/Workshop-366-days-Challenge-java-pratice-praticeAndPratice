public class ConstructorForACar {
    String brand;
    int year;
    ConstructorForACar(String brand, int year){
        this.brand = brand;
        this.year = year;

    }
    public static void main(String [] args){
        ConstructorForACar s1 = new ConstructorForACar("BMW",2000);
        System.out.println(s1.brand);
        System.out.println(s1.year);
    }
}
