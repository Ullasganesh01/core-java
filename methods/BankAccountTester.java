class BankAccountTester {
    public static void main(String[] args) {
        BankAccount.credit(1000);
        BankAccount.credit(1500);
        BankAccount.debit(1000);
        BankAccount.debit(500);
        BankAccount.credit(250);
        BankAccount.credit(2500);
        BankAccount.credit(-500);
        BankAccount.debit(-500);
        BankAccount.debit(5000);
        BankAccount.credit(3000);
        BankAccount.debit(5000);
         
    }
}
