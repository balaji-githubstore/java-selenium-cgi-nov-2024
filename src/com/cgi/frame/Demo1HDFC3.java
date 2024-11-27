package com.cgi.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//switch using name or id as String
public class Demo1HDFC3 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//WebElement
		driver.switchTo().frame("login_page");
		
		//enter userid as john123
		driver.findElement(By.name("fldLoginUserId")).sendKeys("jack123");
		
		//click on Continue
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//switch to main html always
		driver.switchTo().defaultContent();
		
		
	}

}
