package week1;

/**
 * Created by abbyr on 03/03/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class StringUtils
{
   public String reverse(String input) {
      if (input == null) {
         return null;
      }
      return new StringBuilder(input).reverse().toString();
   }
}//class
