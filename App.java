import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner br = new Scanner(System.in);
        branch bra1 = new branch();
        System.out.println(" Enter branch name :");
        String branchname = br.next();
        bra1.setBranchname(branchname);

        // location of branch (country you live in )
        System.out.println(" Enter Location of branch :");
        String location = br.next();
        bra1.setLocation(location);

        // Email address of branch
        System.out.println(" Enter Email Address of  your branch :");
        String address = br.next();
        bra1.setEmail(address);
//customer detail
        Customer cu1 = new Customer();
        Scanner con = new Scanner(System.in);
        System.out.println(" Dear Customer Welcome to Equity Bank \n ");
        System.out.println(" Type 0 to Login ");
        int come = con.nextInt();
        switch (come) {
            case 0:

                System.out.println(" Enter username : ");
                String username = br.next();
                cu1.setUsername(username);
                System.out.println(" Enter password : ");
                String password = br.next();
                cu1.setPassword(password);
                System.out.println("You've logged in\n");
                Scanner check = new Scanner(System.in);
                System.out.println("Enter account Number:");
                String accnumber = check.next();
                System.out.println("\n");
                break;

        }

        // System.out.println("2. New user registration ");
        // choices
        System.out.println(" Now you can Choose what you want  :");
        System.out.println(" 1. Check balance ");
        System.out.println(" 2. Deposit ");
        System.out.println(" 3. Withdraw");
        System.out.println(" 4. To exit");
        Account ac1 = new Account();

        int chooice = br.nextInt();
        switch (chooice) {

            case 1:
                System.out.println(" Your  balance is " + ac1.getBalance());
                break;
            case 2:
                ac1.deposit();
                System.out.println(" Your new balance is " + ac1.getBalance());
                break;
            case 3:
                ac1.withdraw();
                break;
                case 4:
                System.exit(status:0);
                break;
            default:

        }
        // object of acc class

        // Display of Information
        System.out.println("         \n About Bank \n*******************************");
        Bank b1 = new Bank("Equity Bank", "Kenya", "equity@gmail.com");
        System.out.println(b1);

        System.out.println("    *---------------------------------------------*");
        System.out.println(" Branch details :");

        System.out.println(" Branch is :" + bra1.getBranchname());
        System.out.println(" Its location is :" + bra1.getLocation());
        System.out.println(" Its Email address is :" + bra1.getEmail());

    }
}
