package testNGTC;



import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead1 {
	
	@Test
	public void editLead1() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click Leads Link
		driver.findElementByLinkText("Leads").click();
		
		//Find Leads
		driver.findElementByLinkText("Find Leads").click();
		
		//Enter First Name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
		
		//Find Lead Button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		//Get Text (Inspect Lead ID)
		String LeadID = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").getText();
		System.out.println(LeadID);
		
		//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	
		driver.close();
	}

}
