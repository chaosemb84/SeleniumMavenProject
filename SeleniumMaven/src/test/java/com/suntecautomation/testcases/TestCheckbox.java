package com.suntecautomation.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckbox {
	
	public static WebDriver driver;
	
	public static String baseURL="http://www.tizag.com/htmlT/htmlcheckboxes.php";

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get(baseURL);
//		driver.findElement(By.xpath("//div[4]/input[1]")).click();
//		driver.findElement(By.xpath("//div[4]/input[2]")).click();
//		driver.findElement(By.xpath("//div[4]/input[3]")).click();
//		driver.findElement(By.xpath("//div[4]/input[4]")).click();
		
		for(int i=1;i<=4;i++) {
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
		}
		
		WebElement FirstCheckBox=driver.findElement(By.xpath("//div[4]/input[1]"));
		FirstCheckBox.click();
		
		WebElement block=driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		
		List<WebElement> checkboxes=block.findElements(By.name("sports"));
		
		System.out.println("Total Number of CheckBoxes:"+checkboxes.size());
		
		for(WebElement checkbox:checkboxes) {
			checkbox.click();
		}
	}

}
