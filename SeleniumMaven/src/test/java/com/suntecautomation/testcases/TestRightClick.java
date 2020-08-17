package com.suntecautomation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRightClick {
	
	public static WebDriver driver;
	
	public static String baseURl="http://deluxe-menu.com/popup-mode-sample.html";

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get(baseURl);
		
		driver.manage().window().maximize();
		
		WebElement img=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
		
		Actions action=new Actions(driver);
		action.contextClick(img).perform();
		
		Thread.sleep(3000);

		
		WebElement mainslider=driver.findElement(By.id("slider"));
		int width=mainslider.getSize().width/2;
		
		Thread.sleep(2000);
		
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		new Actions(driver).dragAndDropBy(slider, width, 0).perform();
		
		Thread.sleep(5000);
	}

}
