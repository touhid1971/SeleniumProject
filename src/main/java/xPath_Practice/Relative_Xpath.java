package xPath_Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
	
		
		
				//Attribute base Xpath
				driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
				
				//Partial Attribute base Xpath
				driver.findElementByXPath("//input[contains(@name,'PASS')]").sendKeys("crmsfa");
				
				driver.findElementByXPath("//input[contains(@class,'decorative')]").click();
				
				//Link Text (Direct Locator)
				driver.findElementByLinkText("CRM/SFA").click();
				
				//Text Base Xpath
				driver.findElementByXPath("//a[text()='Create Lead']").click();
				
				//Partial Text Base Xpath
				driver.findElementByXPath("//a[contains(text(),'Find')]").click();
				
				driver.findElementByLinkText("Opportunities").click();
				
				//Collections Xpath: (index mandatory) question= 0 does not count as index
				
				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-salesOpportunityId']/a)[2]").click();
				
				//driver.findElementByXPath("(//ul[@class='navHistory']/li)[5]").click();
				
				//Parent Child Navigation/Travel
				
				driver.findElementByXPath("//ul[@class='navHistory']/li[5]").click();
				
				//Handling Dynamic Web element (using starts-with)
				driver.findElementByXPath("(//a[starts-with(@id,'ext-gen')])[5]").click();
				
				//using contains
				
		
		

	}

}
