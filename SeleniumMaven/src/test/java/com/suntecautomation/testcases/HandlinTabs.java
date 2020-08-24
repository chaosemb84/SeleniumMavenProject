package com.suntecautomation.testcases;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlinTabs {
	
	public static WebDriver driver;
	
	public static String baseUrl="https://www.hollisterco.com/shop/wd";

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement columnDriver=driver.findElement(By.cssSelector("#home > footer > div.desktop > div.footer__grid-col--container > div.footer__info-links.grid-col.grid-col-2 > ul > li:nth-child(1)"));
		System.out.println("Total Links in Column=>"+columnDriver.findElements(By.tagName("a")).size());
		
		for(int i=0;i<columnDriver.findElements(By.tagName("a")).size();i++) {
			
			String clickonLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
		}
		
		Iterator<String> iter=driver.getWindowHandles().iterator();
		
		while(iter.hasNext()) {
			driver.switchTo().window(iter.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
