package COM.IRCTC.TESTpackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import COM.IRCTC.POMpackage.BookHotelPOMclass;
import COM.IRCTC.POMpackage.HotelsPOMclass;
import COM.IRCTC.POMpackage.Irctc_HomePOMclass;
import COM.IRCTC.POMpackage.LoginPOMclass;

public class Scenario2 extends TestBaseClass
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
		  HO.CityName("pune");
		  Thread.sleep(2000);
		  JavascriptExecutor js =(JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,300)");
		  Thread.sleep(2000);
		  HO.SelectCity();
		  HO.FromDate();
		  Thread.sleep(2000);
		  HO.SelectFromDate();
		  HO.ToDate();
		  Thread.sleep(2000);
		  HO.SelectToDate();
		  HO.SelectFacility();
	      HO.SelectMethods(HO.Rooms,"1");
	      HO.SelectMethods(HO.Adult,"3");
	      HO.SelectMethods(HO.Children,"1");
		  HO.ClickOnDone();
		  HO.FindButton(); 
		  HO.SecondHotel();
		  
		  
		  List<String> ChangePage3 = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(ChangePage3.get(3));
		  
		  
		  BookHotelPOMclass BH = new BookHotelPOMclass(driver);
		  BH.ContinuetoBook();
		  BH.GuestLogin();
		  BH.EmailO1();
		  BH.MobileNumber01();
		  BH.Login01();
		  BH.MrDopDown(BH.MrTitle,"1");
		  BH.FirstName(); 
		  BH.LastName();
		  Thread.sleep(3000);
		  BH.StateDropDown(BH.State,"MAHARASHTRA");
	      BH.FirstName();
	      Thread.sleep(2000);
	      JavascriptExecutor As =(JavascriptExecutor)driver;
		  As.executeScript("window.scrollBy(0,100)");
		  Thread.sleep(2000);
		  BH.ClickonContinue();
		  BH.ClickMark();
		  BH.MakePayment();
		  BH.Verify();
		  
		    String Actual = BH.ErrorMessage();
			System.out.println(Actual);
			
			String Exp = "OTP not valid, Please try again.";
			
			Assert.assertEquals(Actual, Exp); 
		  
		  
				  
	  }
	
	
}
