package com.cgi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5Css {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete
		
		driver.findElement(By.cssSelector("#email")).sendKeys("hello1234455@gmail.com");
	
		driver.findElement(By.cssSelector("#pass")).sendKeys("welcome123");
		
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"[name='dateDeparture']\").value='05 Dec 2024'");
		
		
//		JavascriptExecutor js =(JavascriptExecutor) driver;
		WebElement depEle= driver.findElement(By.xpath("//input[@name='dateDeparture']"));
		js.executeScript("arguments[0].value='05 Dec 2024'",depEle);
		
	}

}
