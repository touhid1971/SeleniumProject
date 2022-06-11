package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ArrowKey {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // For Chrome
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		
		WebElement item1 = driver.findElementByXPath("(//ol[@id='selectable']/li)[1]");
		WebElement item4 = driver.findElementByXPath("(//ol[@id='selectable']/li)[4]");
		WebElement item5 = driver.findElementByXPath("(//ol[@id='selectable']/li)[5]");
		
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		
		action.keyDown(Keys.CONTROL).click(item1).click(item4).click(item5).release().perform();
		
		driver.switchTo().parentFrame();
		
		driver.findElementByLinkText("Themes").click();
		
		Thread.sleep(3000);
		driver.close();

	}

}
