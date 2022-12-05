package com.pages;


import org.openqa.selenium.support.PageFactory;

import com.driverfactory.DriverFactory;
import com.pagelocators.TabsListPageLocator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TabsListPage{
	
	private AndroidDriver<MobileElement> driver;
	private TabsListPageLocator tabListPageLocators= null;

	public TabsListPage() {
		this.driver= DriverFactory.getDriver();
		this.tabListPageLocators = new TabsListPageLocator();
		PageFactory.initElements(new AppiumFieldDecorator(driver), tabListPageLocators);
	}
	
	
	public void clickReservationsTab() {
		
		 this.tabListPageLocators.reservationsTab.click();
		
		
	}

	

}
