package learnParameters;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapper {
	
	public ChromeDriver driver;

	@Parameters({"url", "uname", "pwd"})
	@BeforeMethod
	public void login(String url, String uname, String pwd) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//get url:
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
	//Close 
	driver.close();
			
	}


	@DataProvider
	public String[][] getData() {
		
		//Create Object of two dimension array with size of array (i.e row and column number)
		String [] [] data = new String [3] [3];
		
		data[0][0] = "TCS";
		data[0][1] = "Touhid";
		data[0][2] = "Choudhury";
		//data[0][3] = "123456";
		//data[0][4] = "abc@gmail.com";
		
		data[1][0] = "ABC";
		data[1][1] = "Kutub";
		data[1][2] = "Uddin";
		
		data[2][0] = "CTS";
		data[2][1] = "Mahbuba";
		data[2][2] = "Sultana";
		
		
		return data;
		
				
	}
}
