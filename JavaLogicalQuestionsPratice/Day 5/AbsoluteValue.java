public class AbsoluteValue {
    public static void main(String [] args){
        // finfing the absolute value withoout math library
        int n = -25;
        int abs;
        if(n  < 0){
            abs = -n;// convert negative into positive

        }else{
            abs = n;
        }
        System.out.println("Absolute value is :" + abs);

    }
}
