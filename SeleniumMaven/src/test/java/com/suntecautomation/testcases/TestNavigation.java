package com.suntecautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNavigation {
	
	public static WebDriver driver;
	
	public static String baseURL="https://letskodeit.teachable.com/p/practice";

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get(baseURL);
		
		driver.navigate().to("https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1");
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		driver.navigate().back();

	}

}
