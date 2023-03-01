public class Account {
    private int AccountNbr;
    private float Balance;
    private String AccountOwner;

    public Account(int accountNbr, float balance, String accountOwner) {
        AccountNbr = accountNbr;
        Balance = balance;
        AccountOwner = accountOwner;
    }

    public int getAccountNbr() {
        return AccountNbr;
    }

    public void setAccountNbr(int accountNbr) {
        AccountNbr = accountNbr;
    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float balance) {
        Balance = balance;
    }

    public String getAccountOwner() {
        return AccountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        AccountOwner = accountOwner;
    }

}
