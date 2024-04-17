public class CheckingAccount extends BankAccount {
    private double interestRate;

    public CheckingAccount() {
        super();
        this.interestRate = 0.0;
    }

    public void processWithdrawal(double amount) {
        double totalWithdrawal = amount;

        if (balance - amount < 0) {
            totalWithdrawal += 30.0;
            System.out.println("Insufficient funds. A $30 overdraft fee has been added.");
        }

        balance -= totalWithdrawal;
    }

    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
