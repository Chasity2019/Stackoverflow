package cucumberframework.steps;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	WebDriver driver;
	
	@Before
	public void setup() throws IOException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver.exe");
		this.driver = new FirefoxDriver();
	}
	
	@Given("^User navigates to the Stackoverflow website$")
	public void user_navigates_to_the_Stackoverflow_website(){
		this.driver.get("http://stackoverflow.com");
	}

	@Given("^User clicks on Login button$")
	public void user_clicks_on_Login_button(){
		//System.out.println("User clicks on Login button"); ///html/body/header/div/ol[2]/li[3]/a
		this.driver.findElement(By.xpath("/html/body/header/div/ol[2]/li[3]/a")).click();
	}

	@Given("^User enters valid username$")
	public void user_enters_valid_username(){
		//System.out.println("User enters valid username"); ////*[@id="email"]
		this.driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("webdriveruniversity2@mail.com");
	}

	@Given("^User enters valid password$")
	public void user_enters_valid_password(){
		//System.out.println("User enters valid password"); ////*[@id="password"]
		this.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Yellow321!");
	}

	@When("^User clicks on the Submit button$")
	public void user_clicks_on_the_Submit_button(){
		//System.out.println("User clicks on the Submit button"); ////*[@id="submit-button"]
		this.driver.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();
	}

	@Then("^User is taken to home page successfully$")
	public void user_is_taken_to_home_page_successfully(){
		//System.out.println("User is taken to home page successfully"); // /html/body/div[3]/div[2]/div[1]/div[1]/div/a
		WebElement askQuestionButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[1]/div/a"));
		assertEquals(true, askQuestionButton.isDisplayed());
		driver.close();
	}


}
