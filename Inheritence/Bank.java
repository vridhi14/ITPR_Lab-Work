import java.util.*;
class account {
    String accNo;
    String name;
    double Balance;

    public void openAccount(String accNo, String name, double Balance) {
        this.accNo = accNo;
        this.name = name;
        this.Balance = Balance;
    }

    public void deposit(double amount) {
        Balance += amount;
        System.out.println("Amount deposited successfully. Current Balance: " + Balance);
    }

    public void withdraw(double amount) {
        if (Balance >= amount) {
            Balance -= amount;
            System.out.println("Amount withdrawn successfully. Current Balance: " + Balance);
        } else {
            System.out.println("Insufficient balance. Current Balance: " + Balance);
        }
    }

    public void displayAccount(String type) {
        System.out.println("--------------- Account Info --------------------");
        System.out.println("Name: " + name);
        System.out.println("A/C No: " + accNo);
        System.out.println("Type of Account: " + type);
        System.out.println("Available Balance: " + Balance);
        System.out.println("------------------------------------------------");
    }

}

class SavingAccount extends account {
    String type = "Savings Account";
    static final double MIN_BALANCE = 1000;
}

class CurrentAccount extends account {
    String type = "Current Account";
    static final double MIN_BALANCE = 5000;
}
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int choice=0;
        do{
            System.out.println("------------------------------------------------------");
            System.out.println("------------ Select Account ------------");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.print("Select any one: ");
            int type = sc.nextInt();

            if(type == 1){
                SavingAccount sa = new SavingAccount();
                System.out.println("------Savings Account------");
                System.out.println("Enter Account Number: ");
                sa.accNo = sc.next();
                System.out.println("Enter Account Holder Name: ");
                sa.name = sc.next();
                System.out.println("Enter Initial Balance (Minimum 1000): ");
                double bal = sc.nextDouble();
                if(bal < SavingAccount.MIN_BALANCE){
                     System.out.println("Initial balance must be >= 1000");
                    continue;
                }
                sa.openAccount(sa.accNo, sa.name, bal);
                int op;
                do{
                    System.out.println("------ Operation ------");
                    System.out.println("1. Withdrawal");
                    System.out.println("2. Deposit");
                    System.out.println("3. A/C info");
                    System.out.println("4. Exit");
                    System.out.print("Select any one: ");
                    op = sc.nextInt();
                       switch (op) {
                        case 1:
                            System.out.print("Enter amount to withdraw: ");
                            sa.withdraw(sc.nextDouble());
                            break;
                        case 2:
                            System.out.print("Enter amount to deposit: ");
                            sa.deposit(sc.nextDouble());
                            break;
                        case 3:
                            sa.displayAccount("Savings Account");
                            break;
                    }
                } while (op != 4);

                } else if (type == 2) {
                CurrentAccount ca = new CurrentAccount();
                System.out.println("------------ Current Account ----------------");
                System.out.print("Enter A/C No.: ");
                ca.accNo = sc.next();
                System.out.print("Enter Customer Name: ");
                ca.name = sc.next();
                System.out.print("Enter Initial balance (>= 5000): ");
                double bal = sc.nextDouble();
                if (bal < CurrentAccount.MIN_BALANCE) {
                    System.out.println("Initial balance must be >= 5000");
                    continue;
                }
                ca.openAccount(ca.accNo, ca.name, bal);

                int op;
                do {
                    System.out.println("------ Operation ------");
                    System.out.println("1. Withdrawal");
                    System.out.println("2. Deposit");
                    System.out.println("3. A/C info");
                    System.out.println("4. Exit");
                    System.out.print("Select any one: ");
                    op = sc.nextInt();

                    switch (op) {
                        case 1:
                            System.out.print("Enter amount to withdraw: ");
                            ca.withdraw(sc.nextDouble());
                            break;
                        case 2:
                            System.out.print("Enter amount to deposit: ");
                            ca.deposit(sc.nextDouble());
                            break;
                        case 3:
                            ca.displayAccount("Current Account");
                            break;
                    }
                } while (op != 4);
            }

            System.out.print("Press 0 to exit or any other number to continue: ");
           choice = sc.nextInt();
        }while(choice != 0);

        System.out.println("Thank you for using our banking system!");
        sc.close();
    }
}
