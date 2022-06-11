package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	ChromeDriver  driver;
	
	@Given("Launch ChromeBrowser and Load URL")
	public void launchChromeBrowserAndLoadURL() {
	    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

		
	@Given("Enter Username as .*")
	public void enterUsernameAsDemoSalesManager(String uname) {
		driver.findElementById("username").sendKeys(uname);
	}


	@Given("Enter Password as .*")
	public void enterPasswordAsCrmsfa(String pwd) {
	    driver.findElementById("password").sendKeys("pwd");
	    
	    }

	@When("Click the Login button")
	public void clickTheLoginButton() {
	    driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("It's navigate Homepage")
	public void itSNavigateHomepage() {
	   System.out.println("driver.getTitle()"); 
	}

	@Then("Click the Logout button")
	public void clickTheLogoutButton() {
	    driver.findElementByClassName("decorativeSubmit");
	}

	@Then("Close Browser")
	public void closeBrowser() {
	   driver.close();
	}

	@Given("Enter Username as Touhid")
	public void enterUsernameAsTouhid() {
		driver.findElementById("username").sendKeys("Touhid");
	}
	

	@Then("It's navigate samepage")
	public void itSNavigateSamepage() {
	    System.out.println("driver.getTitle()");
	}

	@Then("Verify Error message")
	public void verifyErrorMessage() {
	    String errmsg = driver.findElementById("errorDiv").getText();
	    
	    System.out.println(errmsg);
	    
	    if(errmsg.contains("following error occurred during login")) {
			 System.out.println("Error message is contains");
		}
		else {
			System.out.println("Error message not contains");
		}
	}
	    @Given("Click CRMSFA")
	    public void clickCRMSFA() {
	        driver.findElementByLinkText("CRM/SFA").click();
	        
	    }
	
		
		
	    @Given("Click leads link")
	    public void clickLeadsLink() {
	       driver.findElementByLinkText("Leads").click();
	    }
	    
	    @When("Click CreateLead")
		public void clickCreateLead() {
		    driver.findElementByLinkText("Create Lead").click();
		    
		}

		@When("Enter the Company Name as ABC")
		public void enterTheCompanyNameAsABC() {
		    driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
		}

		@When("Enter the First Name as Hema")
		public void enterTheFirstNameAsHema() {
		    driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		}

		@When("Enter the Last Name as Mali")
		public void enterTheLastNameAsMali() {
		   driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		}

		@When("Choose Source as Website")
		public void chooseSourceAsWebsite() {
		    WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		    
		    Select dd = new Select(source);
		    dd.selectByVisibleText("Website");
		}

		@When("Click the Create Lead Button")
		public void clickTheCreateLeadButton() {
		   driver.findElementByName("submitButton").click();
		}

		@Then("Its navigate ViewLead Page")
		public void itsNavigateViewLeadPage() {
		    System.out.println(driver.getTitle());
		}

		@Then("Verify the First Name")
		public void verifyTheFirstName() {
		    String fName = driver.findElementById("viewLead_firstName_sp").getText();
		    
		    if(fName.equals("Hema")) {
		    	System.out.println("First Name Matched");
		    }else {
		    	System.out.println("First Name not Matched");

	    
		}
	
	
	    
		}
	}
	

		    
	



