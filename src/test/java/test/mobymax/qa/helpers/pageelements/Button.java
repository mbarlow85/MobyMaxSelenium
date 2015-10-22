package test.mobymax.qa.helpers.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button {

	public static WebElement btnWork(WebDriver driver)
	{
		return driver.findElement(By.xpath("//div//a[@class='btn btn-primary text-capitalize m-0']"));		
	}
	public static WebElement btnCountry(WebDriver driver)
	{
		return driver.findElement(By.name("country"));		
	}
	
	public static WebElement btnHear(WebDriver driver)
	{
		return driver.findElement(By.name("hear"));		
	}
	
	public static WebElement btnSubmit(WebDriver driver)
	{
		return driver.findElement(By.xpath("//div//button[@class='btn btn-md btn-primary m-lg-top-bottom m-xs-left-right o-signup-submit']"));		
	}
	
	public static WebElement btnRegister(WebDriver driver)
	{
		return driver.findElement(By.id("register-button"));		
	}
	
}
