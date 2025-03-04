package main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;
import java.util.logging.Logger;

/**
 * Created by abbyr on 26/02/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class LoginPage
{

   private WebDriver driver;
   //logger instance java.util.logging (javas logging framework)
   //logger - records events during execution of the program
   //getlogger method - retrives logger
   private static final Logger logger = Logger.getLogger(LoginPage.class.getName());
   //TODO - Locators
   private By usernameField = By.id("username");
   private By passwordField = By.id("password");
   private By loginButton = By.id("submit");
   private By errorMessage = By.id("error");

   //TODO Constructor
   public LoginPage(WebDriver driver){
      this.driver = driver;

   }

   //TODO Actions
   public void enterUsername(String username){
      try{
         driver.findElement(usernameField).sendKeys(username);
         logger.info("Entered username: " + username);
      }catch(NoSuchElementException e){
         logger.severe("Username field not found: " + e.getMessage());
      }catch (TimeoutException e) {
         logger.severe("Timed out waiting for username field: " + e.getMessage());
      } catch (Exception e) {
         logger.severe("An unexpected error occurred while entering username: " + e.getMessage());
      }
   }

   public void enterPassword(String password){
      try
      {
         driver.findElement(passwordField).sendKeys(password);
         logger.info("Entered password: ******");
      }catch(NoSuchElementException e){
         logger.severe("Password field not found: " + e.getMessage());
      }
   }
   public void clickLogin(){
      try
      {
         driver.findElement(loginButton).click();
         logger.info("Clicked Login Button");
      }catch(org.openqa.selenium.NoSuchElementException e){
         logger.severe("Login button not found: " + e.getMessage());
      }
   }
   public String getErrorMessage(){
      try
      {
         return driver.findElement(usernameField).getText();
      }catch(NoSuchElementException | TimeoutException e){
         logger.warning("Error message not found or took too long to appear: " + e.getMessage());
         return "";
      }
   }
}//class
