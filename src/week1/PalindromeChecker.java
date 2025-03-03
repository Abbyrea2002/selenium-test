package week1;

/**
 * Created by abbyr on 03/03/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class PalindromeChecker
{
   // Method to check if a string is a palindrome
   public static boolean isPalindrome(String str) {
      // Remove non-alphanumeric characters and convert to lowercase
      str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

      int start = 0;
      int end = str.length() - 1;

      // Compare characters from both ends
      while (start < end) {
         if (str.charAt(start) != str.charAt(end)) {
            return false; // Not a palindrome
         }
         start++;
         end--;
      }
      return true; // Is a palindrome
   }

//   public static void main(String[] args) {
//      // Test cases
//      String[] testStrings = {
//            "refer",
//            "level",
//            "madam",
//            "hello",
//            "A man, a plan, a canal, Panama!"
//      };
//
//      for (String testStr : testStrings) {
//         System.out.println("\"" + testStr + "\" is palindrome: " + isPalindrome(testStr));
//      }
//   }

}//class
