package COM.IRCTC.POMpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Irctc_HomePOMclass 
{
  
	private WebDriver driver;
	private Actions Act;
	

	
	@FindBy(xpath=("//*[@id='disha-banner-close']"))
	 private WebElement close;	
	
	public void CloseDisha()
	{
		close.click();
	}
	
	
	@FindBy(xpath=("//div[@class='h_menu_drop_button hidden-xs']"))
	 private WebElement MenuButton;	
	
	public void Menubutton()
	{
		MenuButton.click();
	}
	
	@FindBy(xpath=("//label[@for='drop-2']"))
	 private WebElement Holidays;	
	
	public void Holidays()
	{ 
		Holidays.click();
	}
	
	@FindBy(xpath=("(//span[text()='Stays'])[2]"))
	 private WebElement Stays;	
	
	public void Stays()
	{
		Act.moveToElement(Stays).perform();
	}
	
	@FindBy(xpath=("(//span[text()='Lounge'])[2]"))
	 private WebElement Lounge;	
	
	public void Lounge()
	{
		Lounge.click();
	}
	
	
	
	
	
	
	public Irctc_HomePOMclass(WebDriver driver)
	{
	this.driver = driver;
	
	PageFactory.initElements(driver, this);
	
	Act =  new Actions(driver);
	}
	
	
	
	
	
}
