package Stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{
	WebDriver driver;
	@Given("Open the Browser")
	public void open_the_browser() 
	{
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		 driver=new FirefoxDriver();	
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("enter testurl")
	public void enter_testurl() 
	{
	 driver.get("https://www.facebook.com./");
	}

	@Then("login page should be displyed")
	public void login_page_should_be_displyed() 
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
	}

	@When("enter user name and password")
	public void enter_user_name_and_password() {
		driver.findElement(By.id("email")).sendKeys("7760919868");
		driver.findElement(By.name("pass")).sendKeys("4gh16me405");
		
	    
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[.='Log in']")).click();
	}

	@Then("home page is should be displyed")
	public void home_page_is_should_be_displyed() 
	{
		String htitle = driver.getTitle();
		Assert.assertEquals(htitle.contains("Facebook"),true);
	   
	}
	

}
