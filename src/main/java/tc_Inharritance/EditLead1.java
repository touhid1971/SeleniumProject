package tc_Inharritance;



import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wrappar.ProjectSpecificWrappar;

public class EditLead1 extends ProjectSpecificWrappar{
	
	@Test
	public void editLead1() {
		

		
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
	
		
	}

}
