public class ConstructorCalculation {
    int length;
    int width;
    ConstructorCalculation(int length, int width) {
        this.length = length;
        this.width = width;

    }
    public static void main(String [] args){
        ConstructorCalculation cc = new ConstructorCalculation(20,5);
        int area = cc.length*cc.width;
        System.out.println(area);
    }
}
