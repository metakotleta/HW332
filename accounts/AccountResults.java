package accounts;

public class AccountResults {

    private final int value;
    private final String text;
    private final boolean flag;

    public AccountResults(int value, String text, boolean flag) {
        this.value = value;
        this.text = text;
        this.flag = flag;
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public boolean getFlag() {
        return flag;
    }

    @Override
    public String toString() {
        return text;
    }
}
