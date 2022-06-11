package xPath_Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_new_practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		

	}

}
