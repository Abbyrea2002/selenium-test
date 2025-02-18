/**
 * Created by abbyr on 18/02/2025
 * COMMENTS ABOUT PROGRAM HERE
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LoginTest
{

   @Test
   void testLogin() {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\abbyr\\Downloads\\chromedriver-win64\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://practicetestautomation.com/practice-test-login/");
      WebElement username = driver.findElement(By.id("username"));
      WebElement password = driver.findElement(By.id("password"));
      WebElement login = driver.findElement(By.id("submit"));


      username.sendKeys("student");
      password.sendKeys("Password123");
      login.click();

      String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
      assertEquals(expectedUrl, driver.getCurrentUrl());
      driver.quit();
   }
}
//class
