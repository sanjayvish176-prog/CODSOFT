import java.util.Scanner;
class BankAccount{
    double Balance;
    BankAccount(double Balance){
        this.Balance=Balance;
    }
    void deposit(double amount){
        Balance +=amount;
        System.out.println("Deposit successful.");
    }
    void withdraw(double amount){
        if(amount <=Balance){
            Balance -= amount;
            System.out.println("Withdrawal successful.");

        }else {
            System.out.println("Insufficient Balance.");
        }
    }
    void checkBalance(){
        System.out.println("Balance: "+Balance);
    }
}

public class ATMProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);
        int choice;
        do{
            System.out.println("\n1.checkBalance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exite");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                account.checkBalance();
                break;
                case 2:
                System.out.print("Enter deposit amount: ");
                account.deposit(sc.nextDouble());
                break;
                case 3:
                System.out.print("Enter withdraw amount: ");
                break;
                case 4:
                    System.out.println("Thank you!");
                    break;

                    default:
                        System.out.println("Invalid choice.");


            }

        } while(choice!=4);
        
    }
}
