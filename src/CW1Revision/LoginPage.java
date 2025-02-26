package CW1Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by abbyr on 26/02/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class LoginPage
{
   private WebDriver driver;

   //Locators
   private By usernameField = By.id("username");
   private By passwordField = By.id("password");
   private By loginButton = By.id("submit");
   private By errorMessage = By.id("error");

   //Constructor
   public LoginPage(WebDriver driver){
      this.driver = driver;

   }

   //Actions
   public void enterUsername(String username){
      driver.findElement(usernameField).sendKeys(username);
   }
   public void enterPasswrod(String password){
      driver.findElement(passwordField).sendKeys(password);
   }
   public void clickLogin(String username){
      driver.findElement(loginButton).click();
   }
   public String getErrorMessage(){
      return driver.findElement(usernameField).getText();
   }
}//class
