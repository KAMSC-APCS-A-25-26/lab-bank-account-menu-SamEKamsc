import java.util.Scanner;
import java.lang.Math;

public class BankAccountMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        boolean run = true;
        while (run) {
            System.out.println("--- Banl Account Menu ---");
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:  ");
            int choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to Add:  ");
                    double add = sc.nextDouble();
                    System.out.println();
                    if (add >0) {
                        System.out.println("Added $" + (Math.round(add*100))/100.0);
                        balance += (Math.round(balance*100))/100.0;
                        System.out.println("New balance: $" + (Math.round(balance*100))/100.0);
                    }
                    else {
                        System.out.println("Enter positive number");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw:  ");
                    double withdraw = sc.nextDouble();
                    System.out.println();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= (Math.round(withdraw*100))/100.0;
                        System.out.println("Withdrew $" + (Math.round(balance*100))/100.0);
                        System.out.println("New balance: $" + (Math.round(balance*100))/100.0);
                    }
                    else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                case 3:
                    System.out.println("Balance: $" + (Math.round(balance*100))/100.0);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    run = false;
                    break;
                    
            }
        }
    }
}