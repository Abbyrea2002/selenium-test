package CW1Revision;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by abbyr on 26/02/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class LoginPageTest
{

   private WebDriver driver;
   private LoginPage loginPage;

   @BeforeEach
   public void setUp(){
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\abbyr\\Downloads\\chromedriver-win64\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://practicetestautomation.com/practice-test-login/");
      loginPage = new LoginPage(driver);
   }

   @ParameterizedTest
   @CsvSource({
         "student, Password123, Success",
         "invalidUser, Password123, Failure",
         "student, WrongPass, Failure"
   })
   public void testLogin(String username, String password, String expectedOutcome){
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
