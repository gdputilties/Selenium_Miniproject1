package com.src.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.gecko.driver",
		  "C:\\Users\\vijayalakshmi.v.IQZAD\\OneDrive - Coforge Limited\\Documents\\Selenium\\SeleniumAutomation\\resources\\geckodriver.exe"
		  ); WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.google.com/");
		 
	}

}
