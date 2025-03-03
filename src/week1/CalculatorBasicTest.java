package week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by abbyr on 03/03/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class CalculatorBasicTest
{
   CalculatorBasic calculator = new CalculatorBasic();
   @Test
   void testAddition() {
      assertEquals(5, calculator.add(2, 3));
   }
   @Test
   void testSubtraction() {
      assertEquals(1, calculator.subtract(3, 2));
   }
}//class
