package test.mobymax.qa.helpers.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HyperLink {
	
	public static WebElement signUp(WebDriver driver)
	{
		return driver.findElement(By.id("signup"));		
	}

}
