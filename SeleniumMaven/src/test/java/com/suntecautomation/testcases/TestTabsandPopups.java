package com.suntecautomation.testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTabsandPopups {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("opentab")).click();
		
//		String firstWindow=driver.getWindowHandle();
//		System.out.println(firstWindow);
		
		Set<String> winIDs=driver.getWindowHandles();
		Iterator<String> iterate=winIDs.iterator();
		
		String first_window=iterate.next();
		
		
		driver.switchTo().window(first_window);
		
		driver.findElement(By.xpath("//*[@id=\"search-courses\"]")).sendKeys("selenium");
	}

}
