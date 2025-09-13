class BankAccount {
    static String bankName = "SBI";
    static int totalAccounts = 0;
    String accountHolderName;
    final int accountNumber;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static int getTotalAccounts() {
        return totalAccounts;
    }

    void display() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName + ", Holder: " + accountHolderName + ", Account No: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Riya", 101);
        BankAccount a2 = new BankAccount("Riyaaaa"=, 102);
        a1.display();
        a2.display();
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
