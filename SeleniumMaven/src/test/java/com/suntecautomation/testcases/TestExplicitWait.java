package com.suntecautomation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExplicitWait {
	
	public static WebDriver driver;
	
	public static String baseUrl="http://the-internet.herokuapp.com/dynamic_loading/1";
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(baseUrl);
		
		driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 15);
		
		WebElement displayText=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Hello World!')]")));
		
		boolean status=displayText.isDisplayed();
		
		if(status) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}

}
