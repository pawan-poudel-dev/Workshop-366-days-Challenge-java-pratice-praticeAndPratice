public class Counter {
    int count = 0;
    public void increase(){
        count++;
    }
    public static void main(String[] args){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.increase();
        System.out.println("C1 count is :" + c1.count);
        System.out.println(c2.count);
        

        

    }
    
}
