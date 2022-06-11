package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		//driver.get("https://swisnl.github.io/jQuery-contextMenu/deom.html");
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		WebElement rightClick = driver.findElementByXPath("//span[text()='right click me']");
		
		Actions action = new Actions(driver);
		
		action.contextClick(rightClick).perform();
		
		

	}

}
