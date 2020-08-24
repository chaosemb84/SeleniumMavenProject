package com.suntecautomation.testcases;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTabs {
	
	public static WebDriver driver;
	
	public static String baseUrl="https://www.hdfc.com/";

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"HomepageModalVideo\"]/div/div/div[1]/button")).click();
		
		driver.findElement(By.linkText("Blogs")).click();
		
		Iterator<String> iter=driver.getWindowHandles().iterator();
		
		//first iter.next() pointing to current/parent window
		String parentId=iter.next();
		//second iter.next() pointing to child window-blogs window
		String childId=iter.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		
		
		

	}

}
