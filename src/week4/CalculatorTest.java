package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by abbyr on 19/02/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class CalculatorTest
{
   Calculator calculator = new Calculator();

   @Test
   void testAdditionCorrect(){
      assertEquals(6, calculator.add(3,3));
   }

   @Test
   void testAdditionFalse(){
      assertEquals(6, calculator.add(2,3));
   }


   @Test
   void testSubtractionCorrect(){
      assertEquals(5, calculator.subtract(10,5));
   }

   @Test
   void testSubtractionFalse(){
      assertEquals(5, calculator.subtract(10,4));
   }
}//class
