//encapsulaatyion with validation 
public class Employee11 {
    private int id;// data hiding 
    private  double salary;// data hiding by decleaering variables as private 

public void setSalary(double salary){
    
    if(salary<20000){
        System.out.println("Salary is Invalid!!");
    }else{
        this.salary = salary;
    }
    }
       public void  setId( int id){
        this.id = id;

}
public int getId(){
    return id;
}
public double getsalary(){
    return salary;
}

}
    class Employee11Test{
        public static void main(String [] args){
            Employee11 obj = new Employee11();
            obj.setSalary(12000);
            obj.setId(3456791);
            System.out.println("The salary of thee person is :" + obj.getsalary());
            System.out.println("The id of the personn is : " +  obj.getId());
        }
    }

