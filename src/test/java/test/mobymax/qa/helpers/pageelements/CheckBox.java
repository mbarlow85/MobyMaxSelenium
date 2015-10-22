package test.mobymax.qa.helpers.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {
	
	public static WebElement termsAccepted(WebDriver driver)
	{
		return driver.findElement(By.id("termsAccepted"));		
	}	
	public static WebElement mobyMaxTeacher(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='register-element-form']/div[3]/div[1]"));		
	}	
}
