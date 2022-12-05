package com.pages;

import java.time.LocalTime;

import org.openqa.selenium.support.PageFactory;

import com.driverfactory.DriverFactory;
import com.pagelocators.AddReservationFormPageLocator;
import com.utils.Utility;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddReservationFormPage{


	private  AndroidDriver<MobileElement> driver;
	private AddReservationFormPageLocator addReservationFormPageLocator= null;

	public AddReservationFormPage() {

		this.driver= DriverFactory.getDriver();
		this.addReservationFormPageLocator = new AddReservationFormPageLocator();
		PageFactory.initElements(new AppiumFieldDecorator(driver), addReservationFormPageLocator);
	}


	public void enterNameField() {
		
        String currentTime = Utility.getCurrentTime();
		this.addReservationFormPageLocator.nameField.sendKeys("Test " +currentTime);

	}

	public void enterRandomPhoneNumber() {
		String randomNumber = Utility.getrandomNumbers();
		this.addReservationFormPageLocator.phoneNumber.sendKeys(randomNumber);

	}

	public void pickDate() {
		this.addReservationFormPageLocator.dateField.click();
		this.addReservationFormPageLocator.dateOkBtn.click();

	}


	public void pickTime() {

		this.addReservationFormPageLocator.timeField.click();
		this.addReservationFormPageLocator.timeOkBtn.click();
		DriverFactory.waitForPageToLoad();

	}


	public void addGuest() {
		this.addReservationFormPageLocator.guestPicker.click();
	}


	public void selectSectionDropdown() {
		this.addReservationFormPageLocator.sectionDropDown.click();
		this.addReservationFormPageLocator.sectionDropDown_thirdOption.click();
	}

	public void selectTableDropdown() {
		this.addReservationFormPageLocator.tableDropDown.click();
		this.addReservationFormPageLocator.tableDropDown_lastOption.click();
	}


	public void selectOriginDropdown() {
		this.addReservationFormPageLocator.orignDropDown.click();
		this.addReservationFormPageLocator.orignDropDown_thirdOption.click();
	}

	
	public void clickDoneBtn() {
		this.addReservationFormPageLocator.doneBtn.click();
		
	}

}




