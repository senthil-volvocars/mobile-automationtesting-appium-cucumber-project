package com.pagelocators;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ReservationListPageLocator {
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@index=1]")
	public MobileElement plusIcon;

}
