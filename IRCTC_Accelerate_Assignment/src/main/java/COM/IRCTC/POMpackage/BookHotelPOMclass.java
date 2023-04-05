package COM.IRCTC.POMpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookHotelPOMclass 
{
private WebDriver driver;
 private Select s;
 //private Select M;


@FindBy(xpath=("//button[@class='btn btn-radius-none yellow-gradient my-2']"))
 WebElement ContBook;	
	
public void ContinuetoBook() 
{
	ContBook.click();
}

@FindBy(xpath=("//a[@id='profile-tab']"))
WebElement GuestUser ;	

public void GuestLogin() 
{
	GuestUser.click();
}


@FindBy(xpath=("//input[@name='email']"))
WebElement Email1;	

public void EmailO1() 
{
	Email1.click();
	Email1.sendKeys("alam.hawaldar123@gmail.com");
}

@FindBy(xpath=("//input[@name='mobileNo']"))
WebElement Mobile01;	

public void MobileNumber01() 
{
	Mobile01.click();
	Mobile01.sendKeys("9665023223");
}


@FindBy(xpath=("(//button[@class='btn btn-md btn-primary btn-radius yellow-gradient'])[2]"))
WebElement Login01;	

public void Login01() 
{
	Login01.click();
	
}


@FindBy(xpath=("//select[@name='title']"))
public WebElement MrTitle ;	
	

@FindBy(xpath=("//select[@name='state']"))
public WebElement State ;	


public void MrDopDown(WebElement Element,String value)
{
     Element.click();
	 Select s = new Select(Element);
	 s.selectByValue(value); 
}

public void StateDropDown(WebElement Element1,String value)
{
     Element1.click();
	 Select p = new Select(Element1);
	 p.selectByVisibleText(value);
	
}

@FindBy(xpath=("//input[@name='firstName']"))
WebElement Firstname;	
	
public void FirstName() 
{
	Firstname.click();
	Firstname.sendKeys("Alam");
}

@FindBy(xpath=("//input[@name='lastName']")) 
WebElement Lastname;	
	
public void LastName() 
{
	Lastname.click();
	Lastname.sendKeys("Sayyad");
}

@FindBy(xpath=("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[9]/button[2]"))
WebElement Continue ;	

public void ClickonContinue() 
{
	Continue.click();
	
}

@FindBy(xpath=("//span[@class='checkmark']"))
WebElement ClickMark ;	

public void ClickMark() 
{
	ClickMark.click();
	
}

@FindBy(xpath=("//button[text()='Make Payment']"))
WebElement MakePayment ;	

public void MakePayment() throws InterruptedException 
{
	MakePayment.click();
	Thread.sleep(30000);
}

  
@FindBy(xpath=("//button[text()='Verify']"))
WebElement Verify ;	

public void Verify() 
{
	Verify.click();
	
}

@FindBy(xpath="//p[text()='OTP not valid, Please try again.']")
WebElement ErrorMessage;

public String ErrorMessage()
{
	String message = ErrorMessage.getText();
			return message;
	
}


 public BookHotelPOMclass (WebDriver driver)
{
	this.driver = driver;
	
	PageFactory.initElements(driver,this);
	
	//s = new Select(Title);
	//M = new Select(State);

}



}
