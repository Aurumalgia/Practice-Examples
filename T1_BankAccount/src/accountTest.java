import java.text.DecimalFormat;

public class accountTest {
    public static void main(String[] args) {
        Account can = new Account("CAN", 100);
        Account usa = new Account("USA", 500);
        Account mex = new Account("MEX");

        System.out.println("This should print out something like: CAN: $100.00");
        System.out.println(can);
        System.out.println("This should print out something like: MEX: $0.00");
        System.out.println(mex);


        usa.deposit(500);
        mex.deposit(1000);
        can.deposit(2500);

        System.out.println("\n\nThis should print out something like: USA: $1000.00");
        System.out.println(usa);
        System.out.println();
        System.out.println();

        System.out.println("This should print out something like: $4600.0");
        System.out.println("Please replace this line of code with Account.getAllAccountBalance, or whatever you named it");
        System.out.format("$%.2f\n",Account.getAllAccountBalance());

        can.setCurrentBalance(2500);
        System.out.println("\nThis should print out something like: CAN: $2500");
        System.out.println(can);
        System.out.println("\nThis should print out something like: $4500.00");
        System.out.println("Please replace this line of code with Account.getAllAccountBalance, or whatever you named it");
        System.out.format("$%.2f\n",Account.getAllAccountBalance());
    }
}
