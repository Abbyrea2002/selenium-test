package week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by abbyr on 03/03/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class PalindromeCheckerTest
{

   @Test
   public void testNullString() {
      assertFalse(PalindromeChecker.isPalindrome(null), "Null should not be a palindrome");
   }

   @Test
   public void testEmptyString() {
      assertTrue(PalindromeChecker.isPalindrome(""), "Empty string should be considered a palindrome");
   }

   @Test
   public void testSingleCharacter() {
      assertTrue(PalindromeChecker.isPalindrome("a"), "Single character should be a palindrome");
      assertTrue(PalindromeChecker.isPalindrome("Z"), "Single character should be a palindrome");
   }

   @Test
   public void testValidPalindromes() {
      assertTrue(PalindromeChecker.isPalindrome("madam"), "'madam' should be a palindrome");
      assertTrue(PalindromeChecker.isPalindrome("racecar"), "'racecar' should be a palindrome");
      assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"), "'A man a plan a canal Panama' should be a palindrome");
   }

   @Test
   public void testInvalidPalindromes() {
      assertFalse(PalindromeChecker.isPalindrome("hello"), "'hello' should not be a palindrome");
      assertFalse(PalindromeChecker.isPalindrome("world"), "'world' should not be a palindrome");
   }

   @Test
   public void testPalindromeWithSpecialCharacters() {
      assertTrue(PalindromeChecker.isPalindrome("A man, a plan, a canal, Panama!"), "'A man, a plan, a canal, Panama!' should be a palindrome");
   }

   @Test
   public void testPalindromeWithNumbers() {
      assertTrue(PalindromeChecker.isPalindrome("12321"), "'12321' should be a palindrome");
      assertFalse(PalindromeChecker.isPalindrome("12345"), "'12345' should not be a palindrome");
   }

   @Test
   public void testCaseSensitivity() {
      assertTrue(PalindromeChecker.isPalindrome("Madam"), "'Madam' should be a palindrome");
      assertFalse(PalindromeChecker.isPalindrome("Hello"), "'Hello' should not be a palindrome");
   }
}//class
