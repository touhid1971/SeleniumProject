package tc_Inharritance;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wrappar.ProjectSpecificWrappar;

public class DeletLead extends ProjectSpecificWrappar{

		@Test
		
		public void deletLead() {
		

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
				
			


	}

}
