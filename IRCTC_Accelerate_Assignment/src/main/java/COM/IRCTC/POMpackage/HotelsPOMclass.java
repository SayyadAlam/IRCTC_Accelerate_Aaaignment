package COM.IRCTC.POMpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelsPOMclass 
{
 private WebDriver driver;

 
 @FindBy(xpath=("//input[@id='filterText']"))
 private WebElement City;	
	
 public void CityName(String CityName) 
 {
	
	 City.sendKeys(CityName);
	 SelectCity.click();

 }
	

 @FindBy(xpath=("//div[@class='right_type']"))
 private WebElement SelectCity;	
 
	
 
 
 
 

 @FindBy(xpath=("//input[@id='user-data-wrapper-id']"))
 private WebElement SelectFacility;	
	
 public void SelectFacility()
 {
	 SelectFacility.click();
	
 }
 
 
 @FindBy(xpath=("//select[@name='hotelRoom']"))
 public WebElement Rooms;	
	
 
 
 
 @FindBy(xpath=("//select[@name='hotelAdult']"))
 public WebElement Adult;	
	
 
 
 
 @FindBy(xpath=("//select[@name='hotelChild']"))
 public WebElement Children;	
	
 
 
 @FindBy(xpath=("//button[text()='Done']"))
 private WebElement Done;	
	
 public void DoneClick()
 {
	 Done.click();
	 
	
 }
 
 
 @FindBy(xpath=("//button[@class='btn btn-md yellow-gradient home-btn']"))
 private WebElement Find;	
	
 public void FindButton()
 {
	 Find.click();
	 
 }
 
 @FindBy(xpath=("(//div[@class='mid-searchpack'])[2]"))
 private WebElement SecondHotel;	
	
 public void SecondHotel()
 {
	 SecondHotel.click();
	 
 }
 
 public void SelectMethods(WebElement Element,String value)
 {
	 Element.click();
	 Select s = new Select(Element);
	 s.selectByValue(value);
	 
 }
 
	
 
	
	public HotelsPOMclass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
		
		
	}
}
