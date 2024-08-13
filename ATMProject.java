import java.util.Scanner;

 
public class ATMProject {

    public static void main(String args[]) {
        int bankBalance = 100000, withdraw, deposit, userPin = 0000;
        String userId = "kamal143";

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n\t <<>> Welcome To SBI ATM <<>>\n");

            System.out.print("Please Enter UserId :: ");

            String enteredUserId = sc.next();

            System.out.print("Please Enter UserPin :: ");

            int enteredUserPin = sc.nextInt();

            if (enteredUserId.trim().equals(userId.trim()) && enteredUserPin == userPin) {

                System.out.println("\n>>> Login Successful!!\n");

                System.out.println("Choose 1 for Withdraw");
                System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 for Check Balance");
                System.out.println("Choose 4 for EXIT");
                System.out.print("\nChoose the operation you want to perform :: ");

                int choice = sc.nextInt();
                if (choice >= 1 && choice <= 4) {
                    switch (choice) {
                        case 1:
                            System.out.print("Enter money to be withdrawn :: ");

                            withdraw = sc.nextInt();

                            if (bankBalance >= withdraw) {
                                bankBalance = bankBalance - withdraw;
                                System.out.println("\n>>> Please collect your money!!");
                                System.out.println("\n>>> Your Current Balance :: " + bankBalance);
                            } else {
                                // show custom error message
                                System.out.println("\n>>> Insufficient Balance!!\n");
                            }

                            break;

                        case 2:

                            System.out.print("Enter money to be deposited :: ");

           
                            deposit = sc.nextInt();


                            bankBalance = bankBalance + deposit;
                            System.out.println("\n>>> Your Money has been successfully depsited!!");
                            System.out.println("\n>>> Your Current Balance :: " + bankBalance);
                            
                            break;

                        case 3:
                          
                            System.out.println("\n>>> Your Current Balance :: " + bankBalance);
                            
                            break;

                        case 4:
                            // exit from the menu
                            System.exit(0);
                    }
                } else {
                    System.out.println("\n>>> Please Enter Valid Choice!!\n");
                }
            } else {
                System.out.println("\n>>> Please Enter Valid UserId And UserPin!!\n");
            }

        }
    }
}