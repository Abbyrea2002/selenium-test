package week4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by abbyr on 03/03/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class passwordValidator
{
   public static boolean isValidPassword(String password){
      //Regex to check valid password
      String regex = "^(?=.*[0-9])" //must contain least 1 digit
            +"(?=.*[a-z])(?=.*[A-Z])"//1 cap or lower cap letter
            //+"(?=.*[@#$%^&+=!?])" // 1 special char
            +"(?=\\S+$).{8,20}$"; //no spaces atleast 8 char most 20
      //compile ReGex
      Pattern p = Pattern.compile(regex);

      //if pass empty return false
      if(password == null){
         return false;
      }
      //pattern class contains matcher() method
      //to find matching between password and reg expression
      Matcher m = p.matcher(password);

      //return if the password matched ReGex
      return m.matches();
   }

//   public static void main(String args[]){
//      //test 1
//      String str1 = "Meredith2023!";
//      System.out.println(isValidPassword(str1));
//
//      String str2 = "Mer2023";
//      System.out.println(isValidPassword(str2));
//   }
}//class
