package com.pages;



import org.openqa.selenium.support.PageFactory;

import com.driverfactory.DriverFactory;
import com.pagelocators.ReservationListPageLocator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ReservationsListPage  {
	
	private AndroidDriver<MobileElement> driver;
	private ReservationListPageLocator reservationListPageLocator= null;

	public ReservationsListPage() {
		
		this.driver= DriverFactory.getDriver();
		this.reservationListPageLocator = new ReservationListPageLocator();
		PageFactory.initElements(new AppiumFieldDecorator(driver), reservationListPageLocator);
	}


	public void clickPlusIcon() {
		 
        this.reservationListPageLocator.plusIcon.click();
        		 
    }
			
		
	
}
