package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturnToMessenger {
	@FindBy(xpath="//a[ text()=' Return to messenger.com ']")
	private WebElement ReturnToMessenger ;
	
	@FindBy(xpath= "//a[ text()=' Visit our help center ']")
	
	private WebElement visitOurHelpCenter;
	
	
	public  ReturnToMessenger(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonReturnToMessengerbutton() {
		 ReturnToMessenger.click();
		 
	}
	public void clickonvisittourHelpCenter() {
		visitOurHelpCenter.click();
	}
		
	}
	
	
	