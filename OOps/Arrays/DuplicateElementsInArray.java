//this is a logic 1 to find the duplicate elements in array
public class DuplicateElementsInArray {
    public static void main(String[] args){
        String [] arr={"java", "python", "c#" ,"c++","c","java"};
        boolean flag =false;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;i<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate elements found:" + arr[i]);
                    flag = true;

                }
            }
        }
        if(flag = false){
            System.out.println(" Duplicate Elements not found");
        }

    }
    
}
