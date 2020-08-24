package com.suntecautomation.testcases;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotDemo {
	
	public static WebDriver driver;
	
	public static String baseUrl="https://learn.letskodeit.com/p/practice";

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Robot robot=new Robot();
		
		robot.mouseWheel(10);
		
		java.awt.Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		
		BufferedImage img = robot.createScreenCapture(new Rectangle(size));
		
		File path = new File("F:\\Ratheesh\\Selenium\\SeleniumBatchThree\\test.JPG");
		
		ImageIO.write(img, "JPG", path);
		
//		WebElement openBtn=driver.findElement(By.id("openwindow"));
//		
//		Point xBtn=openBtn.getLocation();
//		robot.mouseMove(xBtn.getX(), xBtn.getY());
//		//to click the left mouse button
//		robot.mousePress(InputEvent.BUTTON1_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_MASK);
////        robot.keyPress(KeyEvent.VK_CAPS_LOCK);
        
        
//		
//		robot.keyPress(KeyEvent.VK_ALT);
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_ALT);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.keyPress(KeyEvent.VK_TAB);
//		
//		robot.keyPress(KeyEvent.VK_ALT);
//		robot.keyPress(KeyEvent.VK_F4);
		
//		robot.keyRelease(KeyEvent.VK_ALT);
//		robot.keyRelease(KeyEvent.VK_F4);
		
		
		
		
		
		

	}

}
