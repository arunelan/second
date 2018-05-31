package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;


public class SampleTest {
	WebDriver driver;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.ie.driver","C:\\Users\\training_c2a.05.01\\Desktop\\eclipse\\com\\src\\test\\resources\\IEDriverServer.exe");
	  driver = new InternetExplorerDriver();
	  driver.get("http://www.google.co.in");
	  System.out.println("test method"); 
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Invoking before test method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Invoking After test method");
  }

}
