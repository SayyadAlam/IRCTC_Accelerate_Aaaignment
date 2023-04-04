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
private Select M;


@FindBy(xpath=("//b[text()='Continue to Book']"))
 WebElement ContBook;	
	
public void ContinuetoBook() 
{
	ContBook.click();
}




@FindBy(xpath=("//select[@name='title']"))
WebElement Title ;	
	
public void TitleField() 
{
	Title.click();
	s.selectByValue("1");
	
}


@FindBy(xpath=("(//input[contains(@class,'form-control ng-pristine')])[1]"))
WebElement Firstname;	
	
public void FirstName() 
{
	Firstname.click();
	Firstname.sendKeys("Alam");
}

@FindBy(xpath=("(//input[contains(@class,'form-control ng-pristine')])[2]"))
WebElement Lastname;	
	
public void LastName() 
{
	Lastname.click();
	Lastname.sendKeys("Sayyad");
}

@FindBy(xpath=("//select[@name='state']"))
WebElement State ;	

public void StateSelect() 
{
	Title.click();
	s.selectByVisibleText("MAHARASHTRA");
	
}

@FindBy(xpath=("//button[text()='Continue']"))
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

@FindBy(xpath="// //p[text()='OTP not valid, Please try again.']")
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
	
	s = new Select(Title);
	M = new Select(State);

}



}
