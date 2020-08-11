package com.suntecautomation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLocators {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://3.6.246.140:8080/xelerate/login/user");
		
		WebElement userNameTextBox=driver.findElement(By.name("userName"));
		userNameTextBox.sendKeys("ADMIN");
		driver.findElement(By.name("password")).sendKeys("ADMIN");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Click here")).click();
		driver.findElement(By.xpath("//*[@id=\"USER_HOME_PAGE\"]/table/tbody/tr/td[2]/div/div/div[2]/div/ul/li[1]"));
	}

}
