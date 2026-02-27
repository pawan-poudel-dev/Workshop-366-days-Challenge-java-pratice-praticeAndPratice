public class Person {
    private int age;
    public void setAge(int age){
        if(age >0 && age <=120){
            this.age = age;//assigns obly the valid age 
            System.out.println("This is a valid age:" + age);
        }else{
            System.out.println("This is an invalid age :" + age);
        
        }

    }
    public int getAge(){
        return age;
    }
    
}
