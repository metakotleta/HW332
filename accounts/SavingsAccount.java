package accounts;

public class SavingsAccount extends Account {

    public SavingsAccount(int balance) {
        super(balance);
    }

    @Override
    public AccountResults pay(int amount) {
        String text = "Операция невозможна\nБаланс: " + super.getBalance();
        return new AccountResults(super.getBalance(), text, false);
    }

    @Override
    public AccountResults transfer(Account account, int amount) {
        if (super.getBalance() > amount) {
            return super.transfer(account, amount);
        } else {
            String text = "Операция невозможна, сумма перевода " + amount + " превышает баланс" + super.getBalance();
            return new AccountResults(super.getBalance(), text, false);
        }
    }

    @Override
    public AccountResults addMoney(int amount) {
        return super.addMoney(amount);
    }
}
