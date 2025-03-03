package CW1Revision;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import static org.assertj.core.api.Fail.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Created by abbyr on 26/02/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class LoginPageTest
{

   private WebDriver driver;
   private LoginPage loginPage;
//   @Test
//   public void sampleTest() {
//      assertEquals(2, 1 + 1);
//   }

   @BeforeEach
   public void setUp(){
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\abbyr\\Downloads\\chromedriver-win64\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://practicetestautomation.com/practice-test-login/");
      loginPage = new LoginPage(driver);
      passwordValidator PasswordValidator = new passwordValidator();
   }

   @ParameterizedTest
   @CsvSource({
         "student, Password123, Success",
         "invalidUser, short1, Failure",
         "student, NoNumber, Failure",

   })
   public void testLogin(String username, String password, String expectedOutcome){


      boolean isPasswordValid = passwordValidator.isValidPassword(password);
      assumeTrue(isPasswordValid, "Skipping test due to invalid password format: " + password);
//works to implement method but still executes test
//      if(!passwordValidator.isValidPassword(password)){
//         System.out.println("invalid password " + password);
//      }
      loginPage.enterUsername(username);
      loginPage.enterPassword(password);
      loginPage.clickLogin();

      if(expectedOutcome.equals("Success")){
         assertEquals("https://practicetestautomation.com/logged-in-successfully/", driver.getCurrentUrl());
      }else{
         assertNotEquals("https://practicetestautomation.com/logged-in-successfully/", driver.getCurrentUrl());
      }
   }

   @AfterEach
   public void tearDown(){
      driver.quit();
   }

}//class
