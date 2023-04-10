package COM.IRCTC.TESTpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseClass 

{
public WebDriver driver;

@BeforeMethod
public void setup()
{
	System.setProperty("webdriver.chrome.driver","./D//chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.irctc.co.in");
	
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	
}
	
  @AfterMethod
  public void teardown()
  {
	 //driver.quit();
  }







}
