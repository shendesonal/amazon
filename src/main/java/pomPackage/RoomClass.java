package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomClass {
	@FindBy (xpath="//a[text()='Rooms']")
	private WebElement rooms;
	
	public  RoomClass (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void clickonRoomClass(){
		rooms.click();
	}
	
		
	

}
