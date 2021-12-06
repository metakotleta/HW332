package accounts;

public class CheckingAccount extends Account {

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public AccountResults pay(int amount) {
        if (super.getBalance() > amount) {
            return super.pay(amount);
        } else {
            String text = "Операция невозможно, сумма платежа " + amount + " превышает баланс.\nБаланс: " + super.getBalance();
            return new AccountResults(super.getBalance(), text, false);
        }
    }

    @Override
    public AccountResults transfer(Account account, int amount) {
        if (super.getBalance() > amount) {
            return super.transfer(account, amount);
        } else {
            String text = "Операция невозможна, сумма перевода " + amount + " превышает баланс.\nБаланс: " + super.getBalance();
            return new AccountResults(super.getBalance(), text, false);
        }
    }

    @Override
    public AccountResults addMoney(int amount) {
        return super.addMoney(amount);
    }
}
