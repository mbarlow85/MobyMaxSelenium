package test.mobymax.qa.helpers.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBox {

	public static WebElement firstName(WebDriver driver)
	{
		return driver.findElement(By.name("firstName"));		
	}	

	public static WebElement lastName(WebDriver driver)
	{
		return driver.findElement(By.name("lastName"));		
	}

	public static WebElement companyName(WebDriver driver)
	{
		return driver.findElement(By.name("companyName"));		
	}	

	public static WebElement email(WebDriver driver)
	{
		return driver.findElement(By.name("email"));		
	}

	public static WebElement username(WebDriver driver)
	{
		return driver.findElement(By.name("username"));		
	}

	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.name("password"));		
	}

	public static WebElement captcha(WebDriver driver)
	{
		return driver.findElement(By.name("captcha"));		
	}

	public static WebElement mobyMaxFirstName(WebDriver driver)
	{
		return driver.findElement(By.name("data[FirstName]"));		
	}

	public static WebElement mobyMaxLastName(WebDriver driver)
	{
		return driver.findElement(By.name("data[LastName]"));		
	}

	public static WebElement mobyMaxZipCode(WebDriver driver)
	{
		return driver.findElement(By.name("data[ZipCode]"));		
	}
	
	public static WebElement mobyMaxSchool(WebDriver driver)
	{
		return driver.findElement(By.name("data[School]"));		
	}

	public static WebElement mobyMaxEmail(WebDriver driver)
	{
		return driver.findElement(By.name("data[Email]"));		
	}

	public static WebElement mobyMaxPassword(WebDriver driver)
	{
		return driver.findElement(By.name("data[Password]"));		
	}
	
	public static WebElement mobyMaxState(WebDriver driver)
	{
		return driver.findElement(By.name("snl-state"));		
	}
	
	public static WebElement mobyMaxSelectSchool(WebDriver driver)
	{
		return driver.findElement(By.name("snl-school"));		
	}

}
