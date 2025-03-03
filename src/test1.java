/**
 * Created by abbyr on 18/02/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class test1
{
   public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\abbyr\\Downloads\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.co.uk/");
      driver.manage().window().maximize();
   }
}//class
