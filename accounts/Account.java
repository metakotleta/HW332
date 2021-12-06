package accounts;

public abstract class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public AccountResults pay(int amount) {
        String text = "Выполнено списание в размере " + amount + "\nБаланс: " + (balance -= amount);
        return new AccountResults(balance, text, true);
    }

    public AccountResults transfer(Account account, int amount) {
        AccountResults aResult = account.addMoney(amount);
        if (aResult.getFlag()) {
            balance -= amount;
            String text = "Выполнен перевод в размере " + amount + " на счёт " + account.getClass().getSimpleName()
                    + " (баланс:" + account.getBalance() + ")."
                    + "\nБаланс: " + balance;
            return new AccountResults(balance, text, true);
        } else {
            return new AccountResults(balance, aResult.getText() + "\n" + printBalance(), false);
        }
    }

    public AccountResults addMoney(int amount) {
        String text = "Выполнено зачисление в размере " + amount + " на счёт " + this.getClass().getSimpleName()
                + "\nБаланс: " + (balance += amount);
        return new AccountResults(balance, text, true);
    }

    public String printBalance() {
        return "Баланс: " + balance;
    }

    public int getBalance() {
        return balance;
    }
}
