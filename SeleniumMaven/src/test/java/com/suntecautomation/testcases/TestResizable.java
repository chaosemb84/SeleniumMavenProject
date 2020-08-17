package com.suntecautomation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestResizable {
	
public static WebDriver driver;
	
	public static String baseURl="https://jqueryui.com/resources/demos/resizable/default.html";

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get(baseURl);
		
		driver.manage().window().maximize();
		
		WebElement resizable=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		Actions action=new Actions(driver);
		action.dragAndDropBy(resizable, 400, 400).perform();
		
	}

}
