public class ParameterAndReturnType {
    public int add(int a, int b){
        return a+b;
    }
    public static void main(String [] args){
        ParameterAndReturnType obj = new ParameterAndReturnType();
int summation = obj.add(20,50);
System.out.println("The sum is : "+ summation);
    }
    
}

