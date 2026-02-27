public class Employee1 {
    private int empId;
    private String name;
    public Employee1(int empId, String name){// paramaterized constructor to gather data
        this.empId = empId;
        this.name =name;

    }
    public int getempId(){
        return empId;
    }
    public String getName(){
        return name;
    }
    
}
