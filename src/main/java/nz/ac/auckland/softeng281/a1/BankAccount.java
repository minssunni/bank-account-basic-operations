package nz.ac.auckland.softeng281.a1;

/**
 * University of Auckland
 * SOFTENG 281 - SEMESTER 1 - 2021
 * ASSIGNMENT 1 (A1)
 * <p>
 * Bank Account Class
 */
public class BankAccount {
    private double initialBalance;
    private int transactionsLimit;
    
    /**
     * Construct a BackAccount instance with given initial balance and transactions limit
     *
     * @param initialBalance
     * @param transactionsLimit
     */
    public BankAccount(double initialBalance, int transactionsLimit) {
      this.initialBalance = initialBalance;
      this.transactionsLimit = transactionsLimit;
    }

    /**
     * Default constructor
     */
    public BankAccount() {
      this.initialBalance = 0.0;
      this.transactionsLimit = 10;
    }

    /**
     * returns the current balance
     *
     * @return
     */
    public double getBalance() {
        return this.initialBalance;
    }

    /**
     * return the transaction limit associated to the account
     *
     * @return
     */
    public int getTransactionsLimit() {
        return this.transactionsLimit;
    }
    
    /**
     * Add the given amount to the balance
     *
     * @param amount
     */
    public int numOfTransactions = 0;
    public void deposit(double amount) {
        if (numOfTransactions >= transactionsLimit) {
          System.out.println("transactions limit reached.");
        } else {
          initialBalance += amount;
          numOfTransactions++;
        }
    }

    /**
     * Subtract the given amount from balance
     *
     * @param amount
     */
    public void withdraw(double amount) {
        if (numOfTransactions >= transactionsLimit) {
          System.out.println("transactions limit reached.");
        } else if (amount > initialBalance) {
          System.out.println("amount exceeded");
        } else {
          initialBalance -= amount;
          numOfTransactions++;
        }
    }

    /**
     * Transfer the given amount to Account recipient
     *
     * @param amount
     * @param recipient
     */
    public void transferTo(double amount, BankAccount recipient) {
        if (numOfTransactions >= transactionsLimit || recipient.numOfTransactions >= recipient.transactionsLimit) {
          System.out.println("transactions limit reached");
        } else if (amount > initialBalance) {
          System.out.println("amount exceeded");
        } else {
          initialBalance -= amount;
          recipient.initialBalance += amount;
        }
        
    }

}
