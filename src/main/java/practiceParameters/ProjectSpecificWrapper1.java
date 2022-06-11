package practiceParameters;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class ProjectSpecificWrapper1 {
	
	
	public ChromeDriver driver;
	
	@Parameters({"url", "uname", "pwd"})
	@BeforeMethod
	
	public void login(String url, String uname, String pwd) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(url);
		
		//window maximize:
		driver.manage().window().maximize();
		
		//insert username:
		driver.findElementById("username").sendKeys(uname);
		
		//insert password
		driver.findElementById("password").sendKeys(pwd);
		
		//click login button:
		driver.findElementByClassName("decorativeSubmit").click();
				
		//click CRM/SFA:	
		driver.findElementByLinkText("CRM/SFA").click();

	}
	
	@AfterMethod
	
	public void CloseDriver() {
		
		driver.close();
	}
	
	@DataProvider
	public String[][] PickData() {
		
		String [] [] data1 = new String [3] [1];
		
		data1 [0][0] = "Abdul";
		data1 [1][0] = "Karim";
		data1 [2][0] = "Choudhury";
		
		return data1;
	
		
	}

}
