package com.suntecautomation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIsElementPresent {
	
	public static WebDriver driver;
	
	public static String baseURl="https://www.wikipedia.org/";
	
	public static boolean isElementPresent(By by) {
//		try {
//			driver.findElement(By.id("searchLanguage"));
//			return true;
//		}catch(Throwable t) {
//			return false;
//		}
		int size=driver.findElements(by).size();
		if(size==0) {
			return false;
		}else {
			return true;
		}
	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get(baseURl);
		
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.id("searchLanguage"));
		System.out.println(isElementPresent(By.id("searchLanguage123")));
	}

}
