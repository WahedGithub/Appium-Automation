package com.automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CreateContact {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		URL url = new  URL("http://127.0.0.1:4723/"); 
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Tegu");
		options.setPlatformName("Android");
		options.setPlatformVersion("15.0");
		options.setUdid("48131JEBF16664");
		options.setAppPackage("com.google.android.contacts");
		options.setAppActivity("com.android.contacts.activities.PeopleActivity");
		
		AndroidDriver driver = new AndroidDriver(url, options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement allow = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
		if (allow.isDisplayed()) {
			allow.click();
			System.out.println("clicked on allow");
		}
		else {
			System.out.println("Unable to clicked on allow");
		}
		WebElement createC = driver.findElement(By.id("com.google.android.contacts:id/floating_action_button"));
		if (createC.isDisplayed()) {
			createC.click();
			System.out.println("clicked on +");
		}
		else {
			System.out.println("Unable to clicked on +");
		}
		WebElement FN = driver.findElement(By.xpath("//*[@text='First name']"));
				if (FN.isDisplayed()) {
					FN.sendKeys("abcd");
					System.out.println("clicked on FN");
				}
				else {
					System.out.println("Unable to clicked on FN");
				}
		WebElement LN = driver.findElement(By.xpath("//*[@text='Last name']"));
				if (LN.isDisplayed()) {
					LN.sendKeys("efg");
					System.out.println("clicked on LN");
				}
				else {
					System.out.println("Unable to enter data on FN");
				}
				Thread.sleep(5);
			 //driver.hideKeyboard();
				driver.longPressKey(new KeyEvent(AndroidKey.BACK));
				
				  WebElement company = driver.findElement(By.xpath("//android.view.View[@index='1']"));
				  if
				  (company.isDisplayed()) { 
					  company.sendKeys("google");
					  //enter the keys
					  Thread.sleep(5);
					  WebElement company1 = driver.findElement(By.xpath("//android.view.View[@index='1']"));
					  company1.sendKeys("google");
				  
				  System.out.println("clicked on company"); 
				  } 
				  else {
				  System.out.println("Unable to company"); } 
				  
				  WebElement phone =
				  driver.findElement(By.xpath("//android.view.View[@index='2']")); if
				  (phone.isDisplayed()) { phone.click(); 
				  //enter the keys
				  WebElement phone1 = driver.findElement(By.xpath("//android.view.View[@index='2']"));
				  phone1.sendKeys("123456");
				  System.out.println("clicked on phone"); 
				  }
				  else {
				  System.out.println("Unable to phone"); }
				 
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
