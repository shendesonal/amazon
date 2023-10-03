package pomPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessengerClass {
	@FindBy(xpath="//a[@href='https://messenger.com/']")
    private WebElement messenger ;
	
	public MessengerClass(WebDriver driver) {
		
		PageFactory.initElements(driver , this);
		
		}
	public void clickonMessengerClass ()
	
	
	{
		messenger.click();
	}
}
