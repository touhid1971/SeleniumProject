package xPath_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		//Attribute base xpath
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		
		//Partial Attribute base xpath
		driver.findElementByXPath("//input[contains(@id,'password')]").sendKeys("crmsfa");
		
		driver.findElementByXPath("//input[contains(@value,'Login')]").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Text Base Xpath
		driver.findElementByXPath("//a[text()='Create Opportunity']").click();
		
		//
		
		
		
		//Parent Child Navigation/Travel
		//driver.findElementByXPath("//select[@id='createOpportunityForm_opportunityStageId']/option[3]").click();
	}

}
