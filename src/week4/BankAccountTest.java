package week4;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest{
   @Test
   public void testInitialBalance(){
        BankAccount account = new BankAccount(100);
        assertEquals(100, account.getBalance());
   }

   @Test
   public void testDeposit(){
      BankAccount account = new BankAccount(100);
      account.deposit(100.0);
      assertEquals()
   }
}

