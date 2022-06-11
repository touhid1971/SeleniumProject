package practiceParameters;

import org.testng.annotations.Test;

public class EditLeadParameters extends ProjectSpecificWrapper1{
	
	@Test(dataProvider = "getData")
	
	public void EditLeadParameters1(String fName) {
	
	//Click Leads Link
			driver.findElementByLinkText("Leads").click();
			
			//Find Leads
			driver.findElementByLinkText("Find Leads").click();
			
			//Enter First Name
			driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(fName);
			
			//Find Lead Button
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			
			//Get Text (Inspect Lead ID)
			String LeadID = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").getText();
			System.out.println(LeadID);
			
	}


}
