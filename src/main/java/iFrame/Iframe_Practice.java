package iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Practice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		/*driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByLinkText("Selectable").click();
		driver.switchTo().frame("en");
		driver.findElementByXPath("(//ol[@id='selectable']/li)[2]").click();*/
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//input[@value='John']").clear();
		driver.findElementById("fname").sendKeys("Harun");
		driver.findElementByXPath("//input[@value='Doe']").clear();
		//driver.findElementById("lname").sendKeys("Choudhury");
		
		driver.findElementByXPath("//input[@id='lname']").sendKeys("Chowdhury");
		driver.switchTo().parentFrame();
		
		

	}

}
