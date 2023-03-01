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
        return " The name of bank I use is: " + BankName + "\n My Bank Location is : " + BankLocation
                + "\n My Bank  Info:" + BankAccountInfo;
    }

}