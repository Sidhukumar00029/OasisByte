import java.util.Scanner;

public class ATM {
    private String userId;
    private String userPin;
    private boolean loggedIn;
    
    public ATM() {
        this.userId = "1234"; 
        this.userPin = "5678";
        this.loggedIn = false;
    }
    
    public void start() {
        System.out.println("Welcome to the ATM!");
        authenticateUser();
        
        if (loggedIn) {
            displayMenu();
            performOperations();
        }
        
        System.out.println("Thank you for using the ATM. Goodbye!");
    }
    
    private void authenticateUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user ID: ");
        String enteredUserId = scanner.nextLine();
        
        System.out.print("Enter user PIN: ");
        String enteredUserPin = scanner.nextLine();
        
        if (enteredUserId.equals(userId) && enteredUserPin.equals(userPin)) {
            loggedIn = true;
            System.out.println("Authentication successful. Welcome, " + userId + "!");
        } else {
            System.out.println("Authentication failed. Please try again.");
        }
    }
    
    private void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Transactions History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Quit");
    }
    
    private void performOperations() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    displayTransactionsHistory();
                    break;
                case 2:
                    performWithdrawal();
                    break;
                case 3:
                    performDeposit();
                    break;
                case 4:
                    performTransfer();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
    }
    
    private void displayTransactionsHistory() {
        System.out.println("Displaying transaction history...");
    }
    
    private void performWithdrawal() {
        System.out.println("Performing withdrawal...");
    }
    
    private void performDeposit() {
        System.out.println("Performing deposit...");
    }
    
    private void performTransfer() {
        System.out.println("Performing transfer...");
    }
    
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.start();
    }
}
