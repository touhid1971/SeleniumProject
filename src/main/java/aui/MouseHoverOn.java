package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOn {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("http://mrbool.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		WebElement content = driver.findElementByXPath("//a[@class='menulink']");
		
		Actions action = new Actions(driver);
		action.moveToElement(content).perform();
		
		driver.findElementByXPath("//div[text()='Read it now']").click();
		
		
	}

}
