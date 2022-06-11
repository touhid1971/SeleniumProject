package wrappar;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificWrappar {
	
	public ChromeDriver driver;

	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//get url:
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//window maximize:
		driver.manage().window().maximize();
		
		//insert username:
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//insert password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//click login button:
		driver.findElementByClassName("decorativeSubmit").click();
				
		//click CRM/SFA:	
		driver.findElementByLinkText("CRM/SFA").click();
		
		

	}
	
	@AfterMethod
	public void CloseDriver() {
	//Close 
	driver.close();
			
	}


}
