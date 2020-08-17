package com.suntecautomation.testcases;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebTable {
	
	public static WebDriver driver;
	
	public static String baseURl="https://money.rediff.com/gainers/bsc/daily/groupa";

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get(baseURl);
		
		driver.manage().window().maximize();
		
		List<WebElement> rowNums=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		System.out.println("Number of rows: "+rowNums.size());
		
		List<WebElement> colNums=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		
		System.out.println("Number of columns: "+colNums.size());
		
		for(int rows=1;rows<=rowNums.size();rows++) {
			
			for(int cols=1;cols<=colNums.size();cols++) {
				System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rows+"]/td["+cols+"]")).getText()+"  ");
			}
			
			System.out.println();
		}
		
		
		
	}

}
