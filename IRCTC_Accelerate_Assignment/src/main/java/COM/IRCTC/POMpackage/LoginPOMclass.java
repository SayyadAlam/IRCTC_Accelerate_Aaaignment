package COM.IRCTC.POMpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMclass 
{

private WebDriver driver;


@FindBy(xpath="(//a[@class='nav-link'])[1]")
WebElement LogIn;

public void LogInMethod()
{
	LogIn.click();
}

@FindBy(xpath="//a[@id='profile-tab']")
WebElement GuestLogin;

public void GuestUserLogin()
{
	GuestLogin.click();
}


@FindBy(xpath="//input[@id='modalLRInput12']")
WebElement Email;

public void Emails()
{
	Email.click();
	Email.sendKeys("alam.hawaldar@gmail.com");
}

@FindBy(xpath="(//input[@class='form-control ng-untouched ng-pristine ng-invalid'])[3]")
WebElement MobileNum;

public void MobileNumber()
{
	MobileNum.click();
	MobileNum.sendKeys("9665023231");
}

@FindBy(xpath="(//button[text()='Login'])[2]")
WebElement ClickLogin;

public void ClickLoginButton()
{
	ClickLogin.click();
	
}


@FindBy(xpath="/html/body/app-root/tourpkgs/div[2]/div[2]/ul/li[2]/a")
WebElement Hotels;

public void ClickHotels()
{
	Hotels.click();
	
}






public LoginPOMclass(WebDriver driver)
{
	this.driver = driver;
	
	PageFactory.initElements(driver,this);
			
}




}
