package com.cgi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2FBSignUp {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//span[text()='Allow all cookies'])[2]")).click();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//enter firstname as john
		//enter lastname as wick
		//enter password as welcome123
		
		//20 Dec 2000
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Dec");
		
		//select year as 2000
		
		
		//click on custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//click on submit
	
	}

}
