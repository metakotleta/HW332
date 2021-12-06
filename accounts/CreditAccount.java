package accounts;

public class CreditAccount extends Account {

    public CreditAccount(int balance) {
        super(balance);
    }

    @Override
    public AccountResults pay(int amount) {
        return super.pay(amount);
    }

    @Override
    public AccountResults transfer(Account account, int amount) {
        return super.transfer(account, amount);
    }

    @Override
    public AccountResults addMoney(int amount) {
        if ((super.getBalance() + amount) <= 0) {
            return super.addMoney(amount);
        } else {
            String text = "Операция невозможна, сумма пополнения " + amount
                    + " превышает допустимый баланс " + super.getClass().getSimpleName() + " (баланс:" + super.getBalance() + ")";
            return new AccountResults(super.getBalance(), text, false);
        }
    }
}
