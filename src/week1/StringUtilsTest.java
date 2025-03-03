package week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Created by abbyr on 03/03/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class StringUtilsTest
{
   StringUtils stringUtils = new StringUtils();
   @Test
   void testReverse() {
      assertEquals("cba", stringUtils.reverse("abc"));
   }

   @Test
   void testReverseNull() {
      assertNull(stringUtils.reverse(null));
   }
   @Test
   void testReverseEmptyString() {
      assertEquals("", stringUtils.reverse(""));
   }
}//class
