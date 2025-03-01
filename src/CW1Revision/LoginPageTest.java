package CW1Revision;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\abbyr\\Downloads\\chromedriver-win64\\chromedriver.exe")
      driver = new ChromeDriver();
   }


}//class
