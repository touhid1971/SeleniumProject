package collections;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandesl {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Click on- Try it Yourself
				driver.findElementByPartialLinkText("Try it Yourself »").click();
				
		//getWindowHandels- return all window reference
				
				Set<String> allWin = driver.getWindowHandles();
				
				for(String eachWin:allWin) {
					
					System.out.println(eachWin);
					
					driver.switchTo().window(eachWin);
					
					System.out.println(driver.getTitle());
				}

	}

}
