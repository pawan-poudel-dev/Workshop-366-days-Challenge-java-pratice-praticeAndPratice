public class TemperatureChange {
    public static double temperature(double celcius , double Fahrenheit ) {
        return (celcius *1.5)+ 32;


    }
    public static void main(String [] args){
        System.out.println("The Fahrenheit degree is : " + TemperatureChange.temperature(12,57));

    }
}
