package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("(//input[@id=\"searchBtn\"])[1]").click();
		
		String simpleAlart = driver.switchTo().alert().getText();
		System.out.println(simpleAlart);
		
		Thread.sleep(2000);
		
		
		
		driver.switchTo().alert().accept();

	}

}
