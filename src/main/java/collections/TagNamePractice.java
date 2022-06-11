package collections;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNamePractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> tagname = driver.findElements(By.tagName("div"));
		System.out.println(tagname.size());
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		
		List<WebElement> input = driver.findElements(By.tagName("input"));
		System.out.println(input.size());
		
		List<WebElement> atag = driver.findElements(By.tagName("a"));
		System.out.println(atag.size());
		
		List<WebElement> scripts = driver.findElements(By.tagName("script"));
		System.out.println(scripts.size());
		
		List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
		System.out.println(iframe.size());
		

	}

}
