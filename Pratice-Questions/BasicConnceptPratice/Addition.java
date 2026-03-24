class Addition{
    public Addition(){
        System.out.println("This is a no args constructor");
    }
    public Addition(int a, int b){
        System.out.println("Result from thee parameterized constructor." + (a+b));

    }
    public static void main(String [] args){
        Addition a1 = new Addition();
        Addition a2 = new Addition(12,12);
        Addition a3 = new Addition(23,45);
    }
}