package test.mobymax.qa.tests;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.asprise.ocr.Ocr;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

import test.mobymax.qa.helpers.pageelements.Button;
import test.mobymax.qa.helpers.pageelements.CheckBox;
import test.mobymax.qa.helpers.pageelements.DropDown;
import test.mobymax.qa.helpers.pageelements.HyperLink;
import test.mobymax.qa.helpers.pageelements.TextBox;
import test.mobymax.qa.helpers.primitives.Links;

public class Base {

	protected WebDriver driver;
	private ScreenshotHelper screenshotHelper; 	  

	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver(); 
		//driver=new FirefoxDriver();		
		driver.manage().window().maximize();		
		screenshotHelper = new ScreenshotHelper();
	}

	@After
	public void saveScreenshotAndCloseBrowser() throws IOException {
		//		screenshotHelper.saveScreenshot("screenshot.png");
		//		driver.quit();
	} 

	public void getUpWorkRegistration() throws IOException, InterruptedException
	{
		driver.get(Links.UpWorkUrl); 
		
		if(driver.findElements(By.id("signup")).size()!=0)
		{		
			WebElement linkSignUp=HyperLink.signUp(driver);
			linkSignUp.click();	 
			Thread.sleep(1000);	
		} 

		if(driver.findElements(By.linkText("Work")).size()!=0)
		{
			WebElement btnWork=driver.findElement(By.linkText("Work"));
			Thread.sleep(1000);
			btnWork.click();		    	   
		}

		WebElement firstName=TextBox.firstName(driver);
		firstName.sendKeys("test");	
		Thread.sleep(1000);

		WebElement lastName=TextBox.lastName(driver);
		lastName.sendKeys("test last");
		Thread.sleep(1000);		

		WebElement email=TextBox.email(driver);
		email.sendKeys("test1@gmail.com");
		Thread.sleep(1000);

		WebElement country = Button.btnCountry(driver);
		country.click();
		Thread.sleep(1000);
		DropDown.ddlCountry(driver).click();	
		Thread.sleep(1000);

		WebElement userName=TextBox.username(driver);
		userName.sendKeys("test1");
		Thread.sleep(1000);

		WebElement password=TextBox.password(driver);
		password.sendKeys("test1");
		Thread.sleep(1000);	

		WebElement hear = Button.btnHear(driver);
		hear.click();
		Thread.sleep(1000);
		DropDown.ddlHear(driver).click();
		Thread.sleep(1000);
	
//		String imageUrl=driver.findElement(By.id("captchaImg")).getAttribute("src");  
//			
//		URL url = new URL(imageUrl);  
//		Image image = ImageIO.read(url);  
//		
//		String s = new Ocr().recognize((RenderedImage) image,"","","");  
//		System.out.println("Text From Image : \n"+ s); 

		List<WebElement> elements = driver.findElements(By.className("checkbox-replacement-helper"));
		WebElement chkAccepted=elements.get(1);
		chkAccepted.click();
		Thread.sleep(1000);
		
		WebElement submit = Button.btnSubmit(driver);
		submit.click();		
	} 
	
	public void getMobyMaxRegistration() throws IOException, InterruptedException
	{
		driver.get(Links.MobyMaxUrl); 
		
		if(driver.findElements(By.name("data[FirstName]")).size()!=0)
		{		
			WebElement firstName=TextBox.mobyMaxFirstName(driver);
			firstName.sendKeys("Test1");
		} 
		
		if(driver.findElements(By.name("data[LastName]")).size()!=0)
		{		
			WebElement lastName=TextBox.mobyMaxLastName(driver);
			lastName.sendKeys("Test1");
		} 

		if(driver.findElements(By.xpath("//*[@id='register-element-form']/div[3]/div[1]")).size()!=0)
		{
			WebElement chkTeacher=CheckBox.mobyMaxTeacher(driver);
			Thread.sleep(1000);
			if(chkTeacher.getAttribute("data-checked")=="no")
				chkTeacher.click();		    	   
		}
		
		if(driver.findElements(By.name("data[ZipCode]")).size()!=0)
		{		
			WebElement zip=TextBox.mobyMaxZipCode(driver);
			zip.sendKeys("Test1");
		} 
		
		if(driver.findElements(By.xpath("//*[@class='signup-input-text school text']")).size()!=0)
		{		
			WebElement school=TextBox.mobyMaxSchool(driver);
			school.click();
			Thread.sleep(1000);
			
			WebElement ddlSchool=driver.findElement(By.className("school-not-listed"));
			ddlSchool.click();
			Thread.sleep(1000);
			
			WebElement state=TextBox.mobyMaxState(driver);
			state.click();
			Thread.sleep(1000);
			
			WebElement selectState=driver.findElement(By.id("WA"));		
			selectState.click();
			Thread.sleep(1000);
			
			WebElement selectSchool=TextBox.mobyMaxSelectSchool(driver);		
			selectSchool.sendKeys("school");
			Thread.sleep(1000);
			
			List<WebElement> elements = driver.findElements(By.className("snl-school-name"));
			WebElement element=elements.get(1);
			element.click();
			Thread.sleep(1000);	
		} 
				
		if(driver.findElements(By.name("data[Email]")).size()!=0)
		{		
			WebElement email=TextBox.mobyMaxEmail(driver);
			email.sendKeys("Test1@gmail.com");
		} 
		
		if(driver.findElements(By.name("data[Password]")).size()!=0)
		{		
			WebElement password=TextBox.mobyMaxPassword(driver);
			password.sendKeys("Test123");
		} 
		
		WebElement btnRegister=Button.btnRegister(driver);
		btnRegister.click();
	
	} 

	private class ScreenshotHelper {	  
		@SuppressWarnings("unused")
		public void saveScreenshot(String screenshotFileName) throws IOException {
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File(screenshotFileName));
		}
	}
}
