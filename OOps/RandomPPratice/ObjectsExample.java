class ObjectsExample{
    // state or field 
     int gear = 5;
// method or  behaviour 
        public void braking(){
            System.out.println("Working of the braking.");
        }
        // behaviour or method 


    }
    class Main{
        public static void main(String [] args){
            ObjectsExample obj = new ObjectsExample();// ctreating the constructor  to instinsiate the object 
            System.out.println("The gear is :" + obj.gear);
            obj.braking();

        }
    }
