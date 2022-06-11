package seleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert PromptAlert = driver.switchTo().alert();
		PromptAlert.getText();
		
		PromptAlert.sendKeys("My Name Is Touhid");
		
		Thread.sleep(2500);
		
		driver.switchTo().alert().accept();
		
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
		
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		

	}

}
