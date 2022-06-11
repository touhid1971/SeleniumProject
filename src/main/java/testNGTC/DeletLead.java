package testNGTC;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeletLead {

		@Test
		
		public void deletLead() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
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

		//click Leads
				driver.findElementByLinkText("Leads").click();
				
				//click Find lead link
				driver.findElementByLinkText("Find Leads").click();
				
				//click on phone
				driver.findElementByXPath("//span[text()='Phone']").click();
				
				//click on email
				//driver.findElementByXPath("//span[text()='Email']").click();
				
				//enter phone number(areaCode)
				driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("682");
				
				//enter phone number
				driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("2084048");		
				
				driver.close();


	}

}
