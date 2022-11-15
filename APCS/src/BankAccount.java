/*Kirat Singh
APCS
14 Novermber 2022
*/
public class BankAccount {
    private int accoutnum;
    private String nameofTheOwner;
    private double balanceOfAccount;

    //Constructor
    public BankAccount(int id, String name, double bal) {
        accoutnum = id;
        nameofTheOwner = name;
        balanceOfAccount = bal;
    }

    /**
     * The code contains bank account ID number, Name, Option to deposit to Balance, and to withdraw
     * Pre: Entering name, Account ID, and Current Balance
     * Post: Able to deposit or withdraw money from the account
     */

    // The method return balance of the account
    public double getBalance() {
        return balanceOfAccount;
    }
    // Gives ability to add money to the account
    public double deposit(double amnt) {
        return balanceOfAccount += amnt;
    }
    // Gives ability to withdraw money from the account
    public double withdraw(double amnt) {
        if (amnt <= balanceOfAccount) {
            return balanceOfAccount -= amnt;
        } else
            return -1;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(23, "Tim", 100);
        System.out.println("Current Balance:" + account.getBalance());
        System.out.format("After Withdraw:"+"$%.2f\n" , account.withdraw(50.5));
        System.out.format("After Deposit:" +"$%.2f\n", account.deposit(100));

    }
}
