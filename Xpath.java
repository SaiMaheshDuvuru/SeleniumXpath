package com.seleniumxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

public static void main(String[] args) throws Exception {
		
 WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	   driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	     Thread.sleep(3000);
		    driver.findElement(By.xpath("//input[@maxlength=10]")).sendKeys("");
		       Thread.sleep(3000);
		         driver.findElement(By.xpath("//input[@maxlength=15]")).sendKeys("");
		          Thread.sleep(3000);
		       driver.findElement(By.xpath("//div[@class='container']/input[3]")).sendKeys("");
		       Thread.sleep(3000);
		      driver.findElement(By.xpath("//div[@class='container']/div[2]/input[1]")).sendKeys("");
		     Thread.sleep(3000);
		   driver.findElement(By.xpath("//div[@class='container']/input[4]")).sendKeys("");
		  Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[text()='Clear']")).click();
		Thread.sleep(3000);
	   driver.quit();
	 
	   System.out.println("Code Sucessfully Executed");
	}

}
