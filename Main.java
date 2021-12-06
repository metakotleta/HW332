import accounts.*;

public class Main {

    public static final int BALANCE = 100;
    public static final int CREDIT_BALANCE = 0;
    public static final int SAVING_BALANCE = 0;

    public static void main(String[] args) {
        Account checkingAccount = new CheckingAccount(BALANCE);
        Account creditAccount = new CreditAccount(CREDIT_BALANCE);
        Account savingsAccount = new SavingsAccount(SAVING_BALANCE);

        System.out.println("=================================\nSavings Account:");
        System.out.println(savingsAccount.addMoney(200) + "\n");
        System.out.println(savingsAccount.pay(50) + "\n");
        System.out.println(savingsAccount.transfer(checkingAccount, 70) + "\n");
        System.out.println(savingsAccount.transfer(creditAccount, 70) + "\n");

        System.out.println("=================================\nCredit Account:");
        System.out.println(creditAccount.addMoney(200) + "\n");
        System.out.println(creditAccount.pay(100) + "\n");
        System.out.println(creditAccount.transfer(checkingAccount, 100) + "\n");
        System.out.println(creditAccount.transfer(savingsAccount, 100) + "\n");

        System.out.println("=================================\nCheking Account:");
        System.out.println(checkingAccount.addMoney(200) + "\n");
        System.out.println(checkingAccount.pay(100) + "\n");
        System.out.println(checkingAccount.transfer(savingsAccount, 100) + "\n");
        System.out.println(checkingAccount.transfer(creditAccount, 100) + "\n");
        System.out.println(checkingAccount.pay(300) + "\n");
        System.out.println(checkingAccount.transfer(savingsAccount, 200) + "\n");

        System.out.println("=================================\nBalances:");
        System.out.println(savingsAccount.getClass().getSimpleName() + ": " + savingsAccount.getBalance());
        System.out.println(creditAccount.getClass().getSimpleName() + ": " + creditAccount.getBalance());
        System.out.println(checkingAccount.getClass().getSimpleName() + ": " + checkingAccount.getBalance());
    }
}
