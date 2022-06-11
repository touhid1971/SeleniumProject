package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://jqueryui.com/droppable/");
				
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Switch to Iframe
		driver.switchTo().frame(0);
		
		WebElement src = driver.findElementById("draggable");
		
		WebElement dest = driver.findElementById("droppable");
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(src, dest).perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElementByLinkText("API Documentation").click();

	}

}
