package week4;

/**
 * Created by abbyr on 19/02/2025
 * COMMENTS ABOUT PROGRAM HERE
 */


public class BankAccount {
   private double balance;

   public BankAccount() {
      this.balance = 0.0; // Start with a balance of 0
   }

   // Method to deposit money
   public void deposit(double amount) {
      if (amount <= 0) {
         throw new IllegalArgumentException("Deposit amount must be positive");
      }
      balance += amount; // Add to balance
   }

   // Method to withdraw money
   public void withdraw(double amount) {
      if (amount <= 0) {
         throw new IllegalArgumentException("Withdrawal amount must be positive");
      }
      if (amount > balance) {
         throw new IllegalArgumentException("Insufficient funds for withdrawal");
      }
      balance -= amount; // Deduct from balance
   }

   // Method to get the current balance
   public double getBalance() {
      return balance;
   }
}

