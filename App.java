public class App {
    public static void main(String[] args) throws Exception {
        Branch branch1 = new Branch(" Equity Rwanda ", " Kigali-Rwanda ", " equityrwanda@gmail.com ");
        Bank mybank = new Bank("Equity","Kenya","equity@gmail.com");
        
        System.out.println(mybank);
        System.out.println();
        System.out.println(branch1);
        System.out.println();
    }
}
