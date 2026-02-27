public class Student {
    private String name;// private data
    private int age;//private data 

    // getter methods(Accessors)
    public String getName(){
        return name;

    }
    public int getAge(){
        return age;

    }
    //setters methods mutators
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age>0){// validation
            this.age= age;
            
        }
        else{            System.out.println("Invalid age. Age must be greater than 0.");
        }
    }

        public static void main(String[] args) {
            Student student = new Student();
            student.setName("Alice");
            student.setAge(20);
            
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Age: " + student.getAge());
        
    }
    
}
