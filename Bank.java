class Bank {
    private String BankName;
    private String BankLocation;
    private String BankAccountInfo;

    // first constructor
    public Bank() {

    }

    // second constructor
    public Bank(String bankName, String bankLocation, String bankAccountInfo) {
        BankName = bankName;
        BankLocation = bankLocation;
        BankAccountInfo = bankAccountInfo;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName() {
        BankName = "EQUITY BANK LTD";
    }

    public String getBankLocation() {
        return BankLocation;
    }

    public void setBankLocation() {
        BankLocation = "KENYA";
    }

    public String getBankAccountInfo() {
        return BankAccountInfo;
    }

    public void setBankAccountInfo() {
        BankAccountInfo = "equitybank@gamil.com";
    }

    @Override
    public String toString() {
        return "Nmame=" + BankName + "\n BankLocation=" + BankLocation + "\n BankAccountInfo=" + BankAccountInfo;
    }

}