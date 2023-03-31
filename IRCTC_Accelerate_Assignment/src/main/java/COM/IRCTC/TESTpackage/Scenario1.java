package COM.IRCTC.TESTpackage;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import COM.IRCTC.POMpackage.HotelsPOMclass;
import COM.IRCTC.POMpackage.Irctc_HomePOMclass;
import COM.IRCTC.POMpackage.LoginPOMclass;

public class Scenario1 extends TestBaseClass
{
 
  @Test
  public void VerifyScenario1() 
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
	  HO.CityName("Pune");
	  HO.SelectFacility();
      HO.SelectMethods(HO.Rooms,"1");
      HO.SelectMethods(HO.Adult,"3");
      HO.SelectMethods(HO.Children,"1");
	  HO.DoneClick();
	  HO.FindButton(); 
	  HO.SecondHotel();
	  
	  
	  List<String> ChangePage3 = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(ChangePage3.get(3));
	  
	  
			  
  }
  
  
	
	
}
