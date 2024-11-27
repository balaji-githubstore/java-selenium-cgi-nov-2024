package com.cgi.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//switch index
public class Demo1HDFC {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//index
		driver.switchTo().frame(0);
		
		//enter userid as john123
		driver.findElement(By.name("fldLoginUserId")).sendKeys("jack123");
		
		//click on Continue
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//switch to main html always
		driver.switchTo().defaultContent();
		
		
	}

}
