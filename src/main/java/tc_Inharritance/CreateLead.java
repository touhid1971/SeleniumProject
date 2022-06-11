package tc_Inharritance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrappar.ProjectSpecificWrappar;

public class CreateLead extends ProjectSpecificWrappar{

	//public static void main(String[] args) {
		
		@Test
		public void createLead() {
		
		
		//click create lead:
		driver.findElementByLinkText("Create Lead").click();
		
		//insert company name:
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		
		
		//insert first name:
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		
		//insert last name:
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		
		
		//choose source 
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dd = new Select(src);
		dd.selectByValue("LEAD_CONFERENCE");
		
		//Enter title:
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
		
		//chose industry:
		WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
		Select dd1 = new Select(ind);
		dd1.selectByVisibleText("Aerospace");
		
		//choose ownership:
		WebElement own = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dd2 = new Select(own);
		dd2.selectByIndex(4);
		
		//Enter Description:
		driver.findElementById("createLeadForm_description").sendKeys("TCS");
		
		//Enter Country Code:
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
		
		//Enter Area Code:
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("682");
		
		//Enter Department:
		driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
		
		//Enter Number of Employees:
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		
		//Enter Web URL:
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");
		
		//Enter City:
		driver.findElementById("createLeadForm_generalCity").sendKeys("Cherry Hill");
		
		//Choose State/Province
		WebElement stat = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dd3 = new Select(stat);
		dd3.selectByVisibleText("New Jersey");
		
		//Choose Country:
		WebElement ctry = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dd4 = new Select(ctry);
		dd4.selectByValue("USA");
		
		//Enter Zip/postal Code:
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("75061");
		
		//Choose marketing campaign
		WebElement mkt = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd5 = new Select(mkt);
		dd5.selectByIndex(2);
		
		//Enter Phone Number:
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567890");
		
		//Enter Email Address:
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
		
		//Click Create Lead:
		driver.findElementByName("submitButton").click();
		
		
		


	}

}
