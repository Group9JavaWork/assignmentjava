import java.util.Scanner;

class Account extends Customer{

    private int  accnumber;
    private double balance=300;
    private String acctype;
    private int phonenumber;

    public Account() {
        
    }
    public Account(int accnumber, double balance, String acctype, int phonenumber) {
        this.accnumber = accnumber;
        this.balance = balance;
        this.acctype = acctype;
        this.phonenumber = phonenumber;
    }
    public int getAccnumber() {
        return accnumber;
    }
    public void setAccnumber(int accnumber) {
        this.accnumber = accnumber;
    }
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAcctype() {
        return acctype;
    }
    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }
    public int getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public void deposit(){
        Scanner depo = new Scanner(System.in);
        System.out.println("Enter the amaount you want to deposite ");
        double dep=depo.nextDouble();
        if(dep<=0){ 
            System.out.println("You enter invalid money ");
       
        }
        else{
            this.balance+=dep;
            this.setBalance(balance);
        
    }
    }
    
    public void withdraw(){
        Scanner depo = new Scanner(System.in);
        System.out.println("Enter amount you want  to withdraw:");
        double withdraw=depo.nextDouble();
        if(withdraw > balance){ 
            System.out.println("You don't have enough money to withdraw !");
       
        }
        else{
            this.balance-=withdraw;
            System.out.println("The new balance is "+getBalance());
        }
    }

}
