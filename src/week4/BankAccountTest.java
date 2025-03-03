package week4;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest{
   @Test
   public void testInitialBalance(){
        BankAccount account = new BankAccount(100);
        assertEquals(100, account.getBalance());
   }

   @Test
   public void testDepositValid(){
      BankAccount account = new BankAccount(500);
      account.deposit(100);
      assertEquals(600, account.getBalance());
   }

   @Test
   public void testDepositInvalid(){
      BankAccount account = new BankAccount(700);
      //specify exception
      assertThrows(IllegalArgumentException.class, () ->{
         //block of code which should throw excpetion
         account.deposit(-700);
         //if thrown test passes
      });
   }

   @Test
   public void testWithdrawalValid(){
      BankAccount account = new BankAccount(500);
      account.withdraw(100);
      assertEquals(400, account.getBalance());
   }

   @Test
   public void testWithdrawalMoreThanBalance(){
      BankAccount account = new BankAccount(700);
      assertThrows(IllegalArgumentException.class, () ->{
         account.withdraw(800);
      });
   }

   @Test
   public void testWithdrawalNegNum(){
      BankAccount account = new BankAccount(700);
      assertThrows(IllegalArgumentException.class, () ->{
         account.withdraw(-60);
      });
   }


   @Test
   void testNoOverdraft(){
      BankAccount account = new BankAccount(900);
      account.withdraw(800);
      account.withdraw(150);
      assertEquals(50, account.getBalance());
   }

   @Test
   void testInitialBalanceNegative(){
      assertThrows(IllegalArgumentException.class, () ->{
         new BankAccount(-300);
      });
   }




}

