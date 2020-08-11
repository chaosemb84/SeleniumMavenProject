package com.suntecautomation.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRadioButtons {
	
	public static WebDriver driver;
	
	public static String baseURL="https://letskodeit.teachable.com/p/practice";

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get(baseURL);
		
		List<WebElement> radioButtons=driver.findElements(By.name("cars"));
		
		radioButtons.get(0).click();
		
		boolean BValue=false;
		
		BValue=radioButtons.get(0).isSelected();
		
		if(BValue=true) {
			radioButtons.get(1).click();
		}
			else {
				radioButtons.get(0).click();
			}
		}

	}
