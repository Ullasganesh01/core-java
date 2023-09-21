class BankAccount {
    static double balance ;
    static double minBalance;

    public static boolean credit(double amount){
        if(amount>0){
            balance = balance + amount;
            System.out.println("Amount credited " + amount );
            System.out.println("Current balance : " + balance+ "\n");
            return true;
        }else{
            System.out.println("Enter the amount greater than zero\n");
            return false;
        }
    }

    public static boolean debit(double amount) {
        if(amount>0 && balance>=minBalance && amount<=balance){
            balance = balance - amount;
            System.out.println("Amount debited " + amount);
            System.out.println("Current balance : "+ balance+ "\n");
            return true;
        }else if(amount<0){
            System.out.println("Enter the amount greater than Zero \n");
            return false;
        }else{
             System.out.println("Balance is insufficient\n");
             return false;
        }

    }
}