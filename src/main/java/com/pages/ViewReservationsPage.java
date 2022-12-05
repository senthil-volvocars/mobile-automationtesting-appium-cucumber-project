package com.pages;

import org.openqa.selenium.support.PageFactory;

import com.driverfactory.DriverFactory;
import com.pagelocators.ViewReservationsPageLocators;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ViewReservationsPage {

	private AndroidDriver<MobileElement> driver;
	private ViewReservationsPageLocators viewReservationsPageLocators= null;

	public ViewReservationsPage() {

		this.driver= DriverFactory.getDriver();
		this.viewReservationsPageLocators = new ViewReservationsPageLocators();
		PageFactory.initElements(new AppiumFieldDecorator(driver), viewReservationsPageLocators);

	}

	public void clickReservationItem() {
		this.viewReservationsPageLocators.reservationItem.click();
		DriverFactory.waitForPageToLoad();
		DriverFactory.clickAndroidBackBtn();

	}

	public void dataFormBackBtn() {
		this.viewReservationsPageLocators.clickOnImageBackBtn.click();
	}


	public void menuIcon() {
		this.viewReservationsPageLocators.clickOnMenuBtn.click();
	}

	public void sampleCode() {
		this.viewReservationsPageLocators.clickOnCodeSamples.click();
		DriverFactory.waitForPageToLoad();
	}

	
}
