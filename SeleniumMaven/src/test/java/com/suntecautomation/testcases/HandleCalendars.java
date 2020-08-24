package com.suntecautomation.testcases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCalendars {
	
	public static WebDriver driver;
	
	public static String baseUrl="https://www.goibibo.com/";

	public static void main(String[] args) throws ParseException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("departureCalendar")).click();
		
		String calDate="20210331";
		String months[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		SimpleDateFormat df=new SimpleDateFormat("yyyyMMdd");
		Date d=df.parse(calDate);
		String myDate="fare_"+df.format(d);
		Calendar cal=Calendar.getInstance();
		cal.setTime(d);
	
		System.out.println(myDate);
	
		int day=cal.get(Calendar.DAY_OF_MONTH);
		int month=cal.get(Calendar.MONTH);
		int year=cal.get(Calendar.YEAR);
		
		System.out.println(day);
		System.out.println(months[month]);
		System.out.println(year);
		
		String forwardArrow="//span[@class='DayPicker-NavButton DayPicker-NavButton--next']";
		String travelMonth=months[month]+" "+year;
		
		System.out.println(travelMonth);
		
		String xpathMonthYearSection="//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[5]/div/div/div[2]/div[1]";
		System.out.println(driver.findElement(By.xpath(xpathMonthYearSection)).getText());
		while(!driver.findElement(By.xpath(xpathMonthYearSection)).getText().equals(travelMonth)) {
			driver.findElement(By.xpath(forwardArrow)).click();
			Thread.sleep(1000);
		}
		
		driver.findElement(By.id(myDate)).click();
		
	}

}
