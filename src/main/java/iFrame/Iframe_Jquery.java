package iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Jquery {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByLinkText("Selectable").click();
		driver.switchTo().frame("selectable");
		Thread.sleep(2000);
		driver.findElementByXPath("(//ol[@id='selectable']/li)[2]").click();
		
		

	}

}
