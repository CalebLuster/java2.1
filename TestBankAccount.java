public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        
        account1.setFirstName("John");
        account1.setLastName("Doe");
        account1.setAccountID(12345);
        account1.deposit(1000.0);
        account1.withdraw(500.0);
        account1.accountSummary();
        System.out.println();
        
        CheckingAccount account2 = new CheckingAccount();
        account2.setFirstName("Jane");
        account2.setLastName("Smith");
        account2.setAccountID(54321);
        account2.setInterestRate(1.5);
        account2.deposit(2000.0);
        account2.processWithdrawal(3000.0);
        account2.displayAccount();
    }
}
