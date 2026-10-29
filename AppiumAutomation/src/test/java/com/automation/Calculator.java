package com.automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Calculator {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		URL url = new  URL("http://127.0.0.1:4723/"); 
			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("Tegu");
			options.setPlatformName("Android");
			options.setPlatformVersion("15.0");
			options.setUdid("48131JEBF16664");
			options.setAppPackage("com.google.android.calculator");
			options.setAppActivity("com.android.calculator2.Calculator");
			
			AndroidDriver driver = new AndroidDriver(url, options);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			System.out.println("before click");
			WebElement one = driver.findElement( By.id("com.google.android.calculator:id/digit_1"));
//			WebElement button = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01"));
//			driver.executeScript("mobile: clickGesture", Map.of("elementId", ((RemoteWebElement) button).getId()));
			System.out.println("After click");
			WebElement five = driver.findElement(By.id("com.google.android.calculator:id/digit_5")); 
			WebElement seven = driver.findElement(By.id("com.google.android.calculator:id/digit_7")); 
			WebElement nine = driver.findElement(By.id("com.google.android.calculator:id/digit_9")); 
			
			  WebElement plussymbol = driver.findElement(By.id("com.google.android.calculator:id/op_add")); 
			  WebElement equalsymbol = driver.findElement(By.id("com.google.android.calculator:id/eq"));
			  
			  WebElement output = driver.findElement(By.id("com.google.android.calculator:id/result_preview"));
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			System.out.println(output.getText());
			 		
			//testcase flow
			
			  one.click(); 
			  five.click(); 
			  seven.click();
			  
			  plussymbol.click();
			  
			  nine.click(); 
			  equalsymbol.click();
			 
			driver.quit();
			
	}

}
