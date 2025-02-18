/**
 * Created by abbyr on 16/02/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiWebTest
   {
      @Test
      void testPracticeTestAutomation_ValidLogin() {
         // Set up WebDriver
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\abbyr\\Downloads\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();

         // Navigate to the website
         driver.get("https://practicetestautomation.com/practice-test-login/");

         // Find elements
         WebElement username = driver.findElement(By.id("username"));
         WebElement password = driver.findElement(By.id("password"));
         WebElement loginButton = driver.findElement(By.id("submit"));

         // Valid credentials
         username.sendKeys("student");
         password.sendKeys("Password123");
         loginButton.click();

         // Check if login was successful
         String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
         assertEquals(expectedUrl, driver.getCurrentUrl());

         // Close browser
         driver.quit();
      }

      @Test
      void testPracticeTestAutomation_InvalidLogin() {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matias\\Downloads\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();

         driver.get("https://practicetestautomation.com/practice-test-login/");

         WebElement username = driver.findElement(By.id("username"));
         WebElement password = driver.findElement(By.id("password"));
         WebElement loginButton = driver.findElement(By.id("submit"));

         // Invalid credentials
         username.sendKeys("wrongUser");
         password.sendKeys("wrongPassword");
         loginButton.click();

         // Check if login failed and stays on the login page
         String expectedUrl = "https://practicetestautomation.com/practice-test-login/";
         assertEquals(expectedUrl, driver.getCurrentUrl());

         driver.quit();
      }

      // ------------------- Website 2: The Internet (Herokuapp) ----------------------

      @Test
      void testTheInternet_ValidLogin() {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matias\\Downloads\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();

         driver.get("http://the-internet.herokuapp.com/login");

         WebElement username = driver.findElement(By.id("username"));
         WebElement password = driver.findElement(By.id("password"));
         WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

         // Valid credentials for the site
         username.sendKeys("tomsmith");
         password.sendKeys("SuperSecretPassword!");
         loginButton.click();

         // After successful login, check the expected URL
         String expectedUrl = "http://the-internet.herokuapp.com/secure";
         assertEquals(expectedUrl, driver.getCurrentUrl());

         driver.quit();
      }

      @Test
      void testTheInternet_InvalidLogin() {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matias\\Downloads\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();

         driver.get("http://the-internet.herokuapp.com/login");

         WebElement username = driver.findElement(By.id("username"));
         WebElement password = driver.findElement(By.id("password"));
         WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

         // Invalid credentials
         username.sendKeys("wrongUser");
         password.sendKeys("wrongPass");
         loginButton.click();

         // Stay on the same login page after failed login
         String expectedUrl = "http://the-internet.herokuapp.com/login";
         assertEquals(expectedUrl, driver.getCurrentUrl());

         driver.quit();
      }

      // ------------------- Website 3: SauceDemo ----------------------

      @Test
      void testSauceDemo_ValidLogin() {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matias\\Downloads\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();

         driver.get("https://www.saucedemo.com/");

         WebElement username = driver.findElement(By.id("user-name"));
         WebElement password = driver.findElement(By.id("password"));
         WebElement loginButton = driver.findElement(By.id("login-button"));

         // Valid credentials
         username.sendKeys("standard_user");
         password.sendKeys("secret_sauce");
         loginButton.click();

         // After successful login, check the expected URL
         String expectedUrl = "https://www.saucedemo.com/inventory.html";
         assertEquals(expectedUrl, driver.getCurrentUrl());

         driver.quit();
      }

      @Test
      void testSauceDemo_InvalidLogin() {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matias\\Downloads\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();

         driver.get("https://www.saucedemo.com/");

         WebElement username = driver.findElement(By.id("user-name"));
         WebElement password = driver.findElement(By.id("password"));
         WebElement loginButton = driver.findElement(By.id("login-button"));

         // Invalid credentials
         username.sendKeys("wrongUser");
         password.sendKeys("wrongPass");
         loginButton.click();

         // Stay on the same login page after failed login
         String expectedUrl = "https://www.saucedemo.com/";
         assertEquals(expectedUrl, driver.getCurrentUrl());

         driver.quit();
      }
   }