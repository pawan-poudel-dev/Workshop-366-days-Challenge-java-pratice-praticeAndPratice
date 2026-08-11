public class Example {
    String name ;
    double price;
    int quantity;
    Example(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public static void main(String [] args){
        Example e1 = new Example("Lenovo",10000,2);
        System.out.println(e1.name);
        System.out.println(e1.price);
        System.out.println(e1.quantity);
        Example e2 = new Example("Lenovo",10000,2);
        System.out.println(e2.name);
    }
}
