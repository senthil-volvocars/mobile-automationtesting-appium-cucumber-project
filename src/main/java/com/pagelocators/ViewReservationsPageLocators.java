package com.pagelocators;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ViewReservationsPageLocators {

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Rachel Nabors']")
	public MobileElement reservationItem;

	@AndroidFindBy(xpath="//android.widget.ImageButton")
	public MobileElement clickOnImageBackBtn;

	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"ActionBar\"]/android.widget.ImageButton")
	public MobileElement clickOnMenuBtn;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Code samples']")
	public MobileElement clickOnCodeSamples;
	
	

}
