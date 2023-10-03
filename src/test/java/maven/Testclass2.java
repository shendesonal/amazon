package maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import pomPackage.MessengerClass;
import pomPackage.ReturnToMessenger;
import pomPackage.RoomClass;

public class Testclass2
{
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
    
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	
	MessengerClass messengerClass = new MessengerClass(driver);
	messengerClass.clickonMessengerClass();
	
	String messengerurl = driver.getCurrentUrl();
	if(messengerurl.equals("https://www.messenger.com/")) 
	{
		System.out.println("pass");
	}
	else
	{ 
		System.out.println("fail");
		
	}
	
	RoomClass roomClass = new RoomClass(driver);
	roomClass.clickonRoomClass();
	String value = driver.getCurrentUrl();
	if(value.equals("https://www.messenger.com/rooms")) 
	{
		System.out.println("pass");
	}
	else
	{ 
		System.out.println("fail");
		
	}
	
	ReturnToMessenger returnToMessenger= new ReturnToMessenger(driver);
	returnToMessenger.clickonReturnToMessengerbutton();
	String url = driver.getCurrentUrl();
	
	if(url.equals("https://www.messenger.com/")) 
	{
		System.out.println("pass");
	}
	else
	{ 
		System.out.println("fail");
		
	}
	}
	
}

