package com.pagelocators;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TabsListPageLocator {
	
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Reservations\"));")
	public MobileElement reservationsTab;
	

}
