import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String fName = "";
        String lName = "";
        String id = "";
        boolean successfulRegistration = false;

        try {
            System.out.println("Welcome to account creation");
            System.out.println("Would you like to make a new account?" + "\n");
            System.out.println("Type Yes or Y to continue");
            String res = i.nextLine();

          if (res.equalsIgnoreCase("Yes") || res.equalsIgnoreCase("y")) {
            while (!successfulRegistration) {
            System.out.println("Let's create your account!");
            System.out.println("Please enter your first name");
            fName = i.nextLine();

            System.out.println("Please enter your last name");
            lName = i.nextLine();

            System.out.println("Please enter your account ID, please choose something you will remember");
            id = i.nextLine();

            if(containsOnlyChar(fName) && containsOnlyChar(lName) && !containsOnlyChar(id)) {
                successfulRegistration = true;
                System.out.println("Wonderful, one moment while we process your information");
            } else {
                System.out.println("Lets try that again!");
            }
        }} else {
                System.out.println("No account will be created");
                System.out.println("Exiting...");
                System.exit(0);
            }

            if(successfulRegistration) {
                int idToInt = Integer.parseInt(id);
                CheckingAccount account = new CheckingAccount(fName, lName, idToInt, 1.50);
                account.displayAccount();

                System.out.println("Would you like to make an initial deposit?");
                System.out.println("Please enter Yes or Y to continue");
                res = i.nextLine();

                if (res.equalsIgnoreCase("Yes") || res.equalsIgnoreCase("y")) {
                    System.out.println("Please enter the amount of your deposit");
                    double resNum = i.nextDouble();
                    account.deposit(resNum);

                    System.out.println("Thank you!");
                    System.out.println("Your new balance is: " + account.getAccountBalance());
                    System.out.println("Have a great day!");
                } else {
                    System.out.println("Thank you for coming! Have a great day!");
                }
            }
        } catch (Exception e) {
            System.out.println("Something seems to have gone wrong");
            System.out.println("Error: " + e);
        }
    }

    public static boolean containsOnlyChar (String str){
        if (str.matches("^[ A-Za-z]+$")) {
            return true;
        }
        return false;
    }
}
