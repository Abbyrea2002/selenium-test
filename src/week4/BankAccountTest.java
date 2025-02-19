package week4;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {
   private BankAccount account;

   @BeforeEach
   public void setUp() {
      account = new BankAccount(); // Initialize account before each test
   }

   @Test
   public void testInitialBalance() {
      assertEquals(0.0, account.getBalance(), "Initial balance should be 0");
   }

   @Test
   public void testDeposit() {
      account.deposit(100.0);
      assertEquals(100.0, account.getBalance(), "Balance should be 100 after deposit");
   }

   @Test
   public void testWithdraw() {
      account.deposit(100.0);
      account.withdraw(50.0);
      assertEquals(50.0, account.getBalance(), "Balance should be 50 after withdrawal");
   }

   @Test
   public void testWithdrawMoreThanBalance() {
      account.deposit(100.0);
      Exception exception = assertThrows(IllegalArgumentException.class, () -> {
         account.withdraw(150.0);
      });
      assertEquals("Insufficient funds for withdrawal", exception.getMessage());
   }

   @Test
   public void testNegativeDeposit() {
      Exception exception = assertThrows(IllegalArgumentException.class, () -> {
         account.deposit(-50.0);
      });
      assertEquals("Deposit amount must be positive", exception.getMessage());
   }

   @Test
   public void testNegativeWithdrawal() {
      Exception exception = assertThrows(IllegalArgumentException.class, () -> {
         account.withdraw(-50.0);
      });
      assertEquals("Withdrawal amount must be positive", exception.getMessage());
   }
}

