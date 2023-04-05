package COM.IRCTC.TESTpackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import COM.IRCTC.POMpackage.HotelsPOMclass;
import COM.IRCTC.POMpackage.Irctc_HomePOMclass;
import COM.IRCTC.POMpackage.LoginPOMclass;

public class Scenario1 extends TestBaseClass
{
 
  @Test
  public void VerifyScenario1() throws InterruptedException 
  {
	  Irctc_HomePOMclass HP = new Irctc_HomePOMclass(driver);
	  HP.CloseDisha();
	  HP.Menubutton();
	  HP.Holidays();	  
	  HP.Stays(); 
	  HP.Lounge();
	  
	  List<String> ChangePage1 = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(ChangePage1.get(1));
	  
	  //driver.manage().window().maximize();
	  
	  LoginPOMclass LP = new LoginPOMclass(driver);
	  LP.LogInMethod();
	  LP.GuestUserLogin();
	  LP.Emails();
	  LP.MobileNumber(); 
	  LP.ClickLoginButton();   
	  LP.ClickHotels();
	  
	  
	  List<String> ChangePage2 = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(ChangePage2.get(2));
	   
	  
	  HotelsPOMclass HO = new HotelsPOMclass(driver);
	  HO.CityName("Pune");
	  Thread.sleep(2000);
	  JavascriptExecutor js =(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,300)");
	  Thread.sleep(2000);
	  HO.SelectCity();
	  HO.SelectFacility();
      HO.SelectMethods(HO.Rooms,"1");
      HO.SelectMethods(HO.Adult,"3");
      HO.SelectMethods(HO.Children,"1");
	  HO.ClickOnDone();
	  HO.FindButton(); 
	  HO.SecondHotel();
	  
	  
	  List<String> ChangePage3 = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(ChangePage3.get(3));
	  
	  
			  
  }
  
  
	
	
}
