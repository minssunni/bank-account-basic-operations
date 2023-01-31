package nz.ac.auckland.softeng281.a1;

import java.util.Iterator;

public class Basics {

    /**
     * deposit operation
     *
     * @param currentBalance
     * @param amount
     * @param numOfTransactions
     * @param transactionsLimit
     * @return the new balance
     */
    public static double deposit(double currentBalance, double amount, int numOfTransactions, int transactionsLimit) {
        if (numOfTransactions >= transactionsLimit) {
          System.out.println("transactions limit reached.");
          return currentBalance;
        } else {
          currentBalance += amount;
          return currentBalance;
        }
    }

    /**
     * withdraw operation
     *
     * @param currentBalance
     * @param amount
     * @param numOfTransactions
     * @param transactionsLimit
     * @return the new balance
     */
    public static double withdraw(double currentBalance, double amount, int numOfTransactions, int transactionsLimit) {
        if (numOfTransactions >= transactionsLimit) {
          System.out.println("transactions limit reached.");
          return currentBalance;
        } else if (currentBalance < amount) {
          System.out.println("amount exceeded");
          return currentBalance;
        } else {
          currentBalance -= amount;
          return currentBalance;
        } 
    }

}
