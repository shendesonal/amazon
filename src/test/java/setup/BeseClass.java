package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeseClass {
	
	
	public static WebDriver openchrome() { 

	 System.setProperty("webdriver.chrome.driver","D:\\selenium\\sonal30\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
    return driver;
	}
	

}
