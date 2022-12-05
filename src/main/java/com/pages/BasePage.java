package com.pages;

import org.openqa.selenium.support.PageFactory;

import com.driverfactory.DriverFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
	
	private AndroidDriver<MobileElement> driver;
	 	
	public BasePage() {
		this.driver=  DriverFactory.getDriver();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

}
