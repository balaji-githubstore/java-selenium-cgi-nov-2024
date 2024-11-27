package com.cgi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1Upload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://smallpdf.com/pdf-to-word?srsltid=AfmBOoqMfafxXxjcFosRY5qK9qnotaSL2Ucpredr2nn79EalJ6xi9riD");
		
		//input[@type='file' and @accept='.pdf']
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Mine\\profile.pdf");
		
		
	}
}
