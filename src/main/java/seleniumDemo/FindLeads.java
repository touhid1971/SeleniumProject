package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindLeads {
	public static void main(String[] args) {
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
		
		//Click Leads
		driver.findElementByLinkText("Leads").click();
		
		//Click Find Leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		//Select Lead Id
		driver.findElementByXPath("(//input[@class=' x-form-text x-form-field'])[24]").sendKeys("10118");
		
		//Click Find Leads
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		

	}

}
