package com.src.automation;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject1 {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	
	public void setup(String browser)
	{
		System.out.println("Browser name is : " + browser);
		System.out.println("Thread ID : "+ Thread.currentThread().getId());
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vijayalakshmi.v.IQZAD\\\\OneDrive - Coforge Limited\\\\Documents\\\\Selenium\\\\SeleniumAutomation\\\\resources\\\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijayalakshmi.v.IQZAD\\OneDrive - Coforge Limited\\Documents\\Selenium\\SeleniumAutomation\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
	}
	public void launch_app() throws Exception
	{
		driver.get("https://pega-86-demo.iqzsystems.io/prweb/app/default/b0aUC_g2NnC90uEC3dhEbKXJdQTMkXeP*/!STANDARD");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void enter_user() throws Exception 
	{
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUserID']"));
		username.sendKeys("tcapron");
	}
	
	public void enter_pswd() throws Exception
	{
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("install@1234");
	}
	
	public void clicklogin() throws Exception
	{
		WebElement loginbutton = driver.findElement(By.xpath("//button[@id='sub']"));
		loginbutton.click();
	}
	
	public void get_title() throws Exception 
	{
		System.out.println("Page title is : " + driver.getTitle());
	}
	public void Create_individuallead() throws Exception 
	{
		WebElement createaddition = driver.findElement(By.xpath("//a//span[1]//span[@class='menu-item-icon-imageclass pi pi-plus']"));
		createaddition.click();
		WebElement clickcreate = driver.findElement(By.xpath("//span[text()='Individual Lead']"));
		clickcreate.click();
	}
	
	public void newindividualleadmodal() throws Exception
	{
		WebElement lastname = driver.findElement(By.id("6e54da89"));
		lastname.sendKeys("TestName1");
		Select stage = new Select(driver.findElement(By.name("$PpyWorkPage$pLeadStage")));
		stage.selectByVisibleText("Sales Qualified");
		WebElement submit = driver.findElement(By.name("pyCaseActionAreaButtons_pyWorkPage_15"));
		submit.click();
	}
	
	public void editindividuallead() throws Exception 
	{
		WebElement editbutton = driver.findElement(By.xpath("//body/div[5]/main[1]/div[1]/form[1]/div[3]/div[1]/section[1]/div[1]/span[1]/div[1]/span[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/button[1]"));
		editbutton.click();
	}
	
	public void updateindividuallead() throws Exception
	{
		WebElement firstname = driver.findElement(By.id("546ad300"));
		firstname.sendKeys("TestFirstName1");
		WebElement lastname = driver.findElement(By.id("6e54da89"));
		lastname.clear();
		lastname.sendKeys("TestNameNEW");
		Select stage = new Select(driver.findElement(By.name("$PpyWorkPage$pLeadStage")));
		stage.selectByVisibleText("Marketing Qualified");
		WebElement submit = driver.findElement(By.name("pyCaseActionAreaButtons_pyWorkPage_15"));
		submit.click();
	}
	
	public void convertlead() throws Exception
	{
		WebElement clickaction = driver.findElement(By.xpath("//body/div[5]/main[1]/div[1]/form[1]/div[3]/div[1]/section[1]/div[1]/span[1]/div[1]/span[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/span[1]/button[1]"));
		clickaction.click();
		WebElement convertlead = driver.findElement(By.xpath("//span[contains(text(),'Convert lead')]"));
		convertlead.click();
	}
	
	public void convertleadmodal() throws Exception
	{
		WebElement Opportunityname = driver.findElement(By.id("8dcd183b"));
		Opportunityname.sendKeys("Opportunitytest");
		WebElement amount = driver.findElement(By.id("1dfe6fd2"));
		amount.sendKeys("12345");
		WebElement datepicker = driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]/img[1]"));
		datepicker.click();
		WebElement dateclick = driver.findElement(By.xpath("//*[@id=\"c0445fa3\"]"));
		dateclick.click();
		WebElement clicksubmit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		clicksubmit.click();
	}
	
	public void finish() 
	{
		driver.quit();
		System.out.println("Test is successful");
	}
	

	
	public static void main(String[] args) throws Exception {
		MiniProject1 m = new MiniProject1();
	  m.setup("chrome");
	  m.launch_app();
	  m.enter_user();
	  m.enter_pswd();
	  m.clicklogin();
	  m.get_title();
	  m.Create_individuallead();
	  m.newindividualleadmodal();
	  m.editindividuallead();
	  m.updateindividuallead();
	  m.convertlead();
	  m.convertleadmodal();
	  m.finish();
	  
	  
	}
}
