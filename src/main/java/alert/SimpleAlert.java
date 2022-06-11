package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	private static final TimeUnit Seconds = null;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, Seconds);
		
		driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();

		String simpleAlert = driver.switchTo().alert().getText();
		System.out.println(simpleAlert);
		
		driver.switchTo().alert().accept();
		
		

	}

}
