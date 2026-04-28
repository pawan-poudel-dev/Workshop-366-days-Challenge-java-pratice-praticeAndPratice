class ATMMachine {
    public static void main(String[] args) {

        double balance = 5000;
        double withdrawAmount = 3500;

        if (withdrawAmount < 0) {
            System.out.println("Invalid amount");
        }
        else if (withdrawAmount == 0) {
            System.out.println("Please enter an amount");
        }
        else if (withdrawAmount > balance) {
            System.out.println("Insufficient balance");
        }
        else {
            balance = balance - withdrawAmount;
            System.out.println("Withdraw Successful");
            System.out.println("New Balance: " + balance);
        }
    }
}