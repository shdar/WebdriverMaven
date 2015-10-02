package com.darshil.java.GitMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		
		driver = new FirefoxDriver();
		
	}
	@Test
	public void doLogin() {
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("shdar123@gmail.com");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}

