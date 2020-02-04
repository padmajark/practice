package scenario5;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;


public class casestudy5 {
	WebDriver driver;
	@When("User goes login page")
	public void user_goes_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_C2a.04.30\\Desktop\\Selenium drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.findElement(By.linkText("SignIn")).click();
		  driver.findElement(By.name("userName")).sendKeys("Lalitha");
		  driver.findElement(By.name("password")).sendKeys("Password123");
		  driver.findElement(By.name("Login")).click();
		
	    
	}

	@When("searches for the product")
	public void searches_for_the_product() {
		driver.findElement(By.name("products")).sendKeys("head");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		String a=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[1]/center[1]/h4")).getText();
		Assert.assertEquals(a,"Headphone");
	    
	    System.out.println("Both are Matched");
	}

	@When("product is displayed")
	public void product_is_displayed() {
	   System.out.println("Product is displayed correctly in this page");
	}


}

