
class VotingEligibility{
    public static void main(String [] args){
        int age = 20;
        boolean hasId = false;
        if(age >= 18){
            
            if(hasId == true){
                System.out.println("you are elligible to vote and have  a valid voter card.");
            }else{
                System.out.println("you are elligible to vote but you don\'t have the voter card .");


            }

        

            
        }else{
            System.out.println("You are not elligible for voting.");
        }
    }}