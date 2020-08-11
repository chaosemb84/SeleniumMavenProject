package com.suntecautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestMultiBrowser {
	
	public static String browser="chrome";
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equals("IE")) {
			driver=new InternetExplorerDriver();
		}
		
		driver.get("https://letskodeit.teachable.com/p/practice");
		String Title=driver.getTitle();
		System.out.println(Title.length());
		System.out.println(Title);
		driver.quit();
		

	}

}
