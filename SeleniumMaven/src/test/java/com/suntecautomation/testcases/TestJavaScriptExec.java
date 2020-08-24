package com.suntecautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestJavaScriptExec {
	
	public static WebDriver driver;
	
	public static String baseUrl="http://3.6.246.140:8080/xelerate/login/user";

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://3.6.246.140:8080/xelerate/login/user");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById(\"userName\").value='ADMIN'");
		js.executeScript("document.getElementById(\"password\").value='ADMIN'");
		js.executeScript("document.getElementById(\"loginButton\").click()");
		
		js.executeScript("openQuickLink('CUSTOMER_MAIN','/cc_main/create','Customer','Entry','Create','CUSTOMER_MAIN_Create_Obj')");
		
		
		
	}

}
