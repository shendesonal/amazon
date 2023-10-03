package maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomPackage.MessengerClass;
import pomPackage.ReturnToMessenger;
import pomPackage.RoomClass;
import setup.BeseClass;




public class TestNG extends BeseClass {
	private WebDriver driver;
	private MessengerClass messengerClass;
    private RoomClass roomClass;
    private ReturnToMessenger returnToMessenger;
    @BeforeTest
	public void launchbrowser(String browsername) {
		if(browsername.equals("Chrome")) {
		driver = openchrome();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@BeforeClass
	public void createpomobjects()
	{
		MessengerClass messengerClass = new MessengerClass(driver);
		RoomClass roomClass = new RoomClass(driver);
		ReturnToMessenger returnToMessenger= new ReturnToMessenger(driver);
		
	}
	@BeforeMethod
	public void openfacebook() throws InterruptedException
	{
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
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
	}

	
	    @Test
	    public void verifygoback()
	    {
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
	    @AfterMethod
	    public void logout() {
	    	
	    }
	    @AfterClass
	    public void nullobject() {
	    MessengerClass messengerClass = null;
	    RoomClass roomClass =null;
		ReturnToMessenger returnToMessenger=null;
	    }
		
		@AfterTest
		public void closebrowser(){
			driver.close();
			driver=null;
			System.gc();
		}
	    
	    
	    
	    
	    
	    
			
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	 {System.setProperty("webdriver.chrome.driver","D:\\selenium\\sonal30\\chromedriver_win32 (1)\\chromedriver.exe");
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
		
		

	


