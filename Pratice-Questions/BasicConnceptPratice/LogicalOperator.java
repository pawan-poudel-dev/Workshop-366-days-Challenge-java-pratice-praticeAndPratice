
/*
Given a person's age, use relational and logical operators to check and print: (a) whether they are eligible to vote (≥18), and (b) whether they are a senior citizen AND eligible to vote (≥60 AND ≥18).

 */

public class LogicalOperator {
    public static void main(String [] args){
        int age =90;
        if(age >= 18){
            System.out.println("You are elligilble to vote.");
        }else{
            System.out.println("Yu are not elligilbe to vote.");
        }
        // check senior citizen and voting eiligibility
        if(age >= 60 && age>= 18){
            System.out.println("You are senior citizen and eligible to vote.");
        }else{
            System.out.println("You are not a senior Citizen.");
        }

    }
}
