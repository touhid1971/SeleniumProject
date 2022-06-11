package seleniumDemo;


import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		//insert username:
				driver.findElementById("username").sendKeys("DemoSalesManager");
				
				//insert password
				driver.findElementById("password").sendKeys("crmsfa");
				
				//click login button:
				driver.findElementByClassName("decorativeSubmit").click();
						
				//click CRM/SFA:	
				driver.findElementByLinkText("CRM/SFA").click();
				
				driver.findElementByLinkText("Leads").click();
				
				driver.findElementByLinkText("Merge Leads").click();
				
				driver.findElementByLinkText("Merge").click();
				
				String ConfirmationAlert = driver.switchTo().alert().getText();
				System.out.println(ConfirmationAlert);
				
				Thread.sleep(3000);
				
				driver.switchTo().alert().dismiss();

		
		

	}

}
