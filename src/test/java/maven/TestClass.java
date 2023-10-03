package maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage.MessengerClass;
import pomPackage.ReturnToMessenger;
import pomPackage.RoomClass;



public class TestClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\sonal30\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		MessengerClass messengerClass = new MessengerClass(driver);
		messengerClass.clickonMessengerClass();
		
		RoomClass roomClass = new RoomClass(driver);
		roomClass.clickonRoomClass();
		
		ReturnToMessenger returnToMessenger= new ReturnToMessenger(driver);
		returnToMessenger.clickonvisittourHelpCenter();
	}

}
