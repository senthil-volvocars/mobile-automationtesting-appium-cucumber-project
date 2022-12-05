package com.pages;


import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import com.driverfactory.DriverFactory;
import com.pagelocators.HomePageLocators;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class HomePage {
	
	private AndroidDriver<MobileElement> driver;
	private HomePageLocators homePageLocators= null;
	
	public HomePage() {
		this.driver= DriverFactory.getDriver();
		this.homePageLocators = new HomePageLocators();
		PageFactory.initElements(new AppiumFieldDecorator(driver), homePageLocators);
	}
	
	
	public boolean checkIfGetStartedButtonIsVisible() {
		return this.homePageLocators.getStartButtonElem.isDisplayed();
	}


	public boolean checkIfGetStartedButtonIsClickable() {
		return this.homePageLocators.getStartButtonElem.isEnabled();
	}

	public void clickGetStartedButton() {
		 this.homePageLocators.getStartButtonElem.click();
		 
		 String currentActivity = driver.currentActivity();
		 String currentPkg = driver.getCurrentPackage();
		
		 System.out.println("currentActivity "+currentActivity);
		 System.out.println("currentPkg "+currentPkg);
		 driver.runAppInBackground(Duration.ofSeconds(10));
		// DriverFactory.launchMessagingApp(driver);
		 
		// DriverFactory.relaunchActivity(driver,currentActivity,currentPkg);
	   
	     
	     
		
		 
	}


}
