package com.suntecautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestImplicitlyWait {
	
	public static WebDriver driver;
	
	public static String baseUrl="https://accounts.google.com/login?hl=en";

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get(baseUrl);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement usname=driver.findElement(By.id("identifierId"));
		usname.sendKeys("ratish.jayemb@gmail.com");
		usname.sendKeys(Keys.RETURN);
		
	}

}
