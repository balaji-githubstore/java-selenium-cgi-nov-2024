package com.cgi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1FBLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete
		
		//findElement--> checks the presence of locator in 0.5s 
		//driver.findElement(By.id("email")).sendKeys("hello1234455@gmail.com");
		
		By loc=By.id("email");
		WebElement ele= driver.findElement(loc);
		ele.sendKeys("hello1234455@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("welcome123");
		
		driver.findElement(By.name("login")).click();
		
	}
}
