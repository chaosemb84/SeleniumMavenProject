package com.suntecautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAlert {
	
	public static WebDriver driver;
	
	public static String baseUrl="http://the-internet.herokuapp.com/javascript_alerts";
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		
//		Alert alert=driver.switchTo().alert();
		
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		   Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		   System.out.println(alert.getText());
			alert.accept();
	}

}
