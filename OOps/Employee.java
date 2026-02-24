public class Employee {
    String name;
    static  String company = "ABC Ltd";
    Employee(String name){
        this.name = name;
    }
    void display(){
        System.out.println(name + " " + company);
    }
    
    public static void main(String [] args){
        Employee e1 = new Employee("pawan");
        Employee e2 = new Employee("Haru");
        Employee e3 = new Employee("krishna");
        e1.display();
        e2.display();
        e3.display();
    }
}
    