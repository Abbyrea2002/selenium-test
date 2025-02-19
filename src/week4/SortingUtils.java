package week4;

/**
 * Created by abbyr on 19/02/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
import java.util.Arrays;

public class SortingUtils {
   public static int[] sortArray(int[] arr) {
      if (arr == null) {  // Check for null input
         throw new IllegalArgumentException("Input array cannot be null");
      }
      int[] sortedArray = arr.clone(); // Clone the input array to avoid modifying the original one
      Arrays.sort(sortedArray); // Sort the cloned array
      return sortedArray; // Return the sorted array
   }
}

