package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by abbyr on 19/02/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class SortingUtilsTest
{

   @Test
   void testSortingWithInvalidData(){
      int[] input = {5, 3, 8, 1, 2};
      int[] expected = {2, 1, 3, 5, 8};
      assertArrayEquals(expected, SortingUtils.sortArray(input));
   }

   @Test
   void testSortingWithEmpty(){
      int[] input = {};
      int[] expected = {};
      assertArrayEquals(expected, SortingUtils.sortArray(input));
   }



}//class
