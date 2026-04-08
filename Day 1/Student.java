public class Student {
    private String name;
    private int age;
    // getter methods 
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    // implementing the setter methods 
    public void setName(String name){
        this.name  = name;
    }
    public void setAge(int age){
        if(age > 0){// validation and restriction on age that it cannot go down from 1 
            this.age = age;
        }
    }

    
}
