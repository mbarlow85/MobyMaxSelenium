package test.mobymax.qa.helpers.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDown {

	public static WebElement ddlCountry(WebDriver driver)
	{
		//return driver.findElement(By.xpath("//div//ul[@class='dropdown-menu']"));
		return driver.findElement(By.xpath("//*[text()='United States']"));	
	}	
	
	public static WebElement ddlHear(WebDriver driver)
	{
		//return driver.findElement(By.name("hear"));
		return driver.findElement(By.xpath("//*[text()='Friend']"));		
	}
}
