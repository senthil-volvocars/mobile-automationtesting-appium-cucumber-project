package com.driverfactory;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;



public class DriverFactory {


	private final static int PAGE_LOAD_TIMEOUT = 3000;
	
	private static ThreadLocal<AndroidDriver<MobileElement>> tldriver = new ThreadLocal<>();
	private static String appPackage = "org.nativescript.examples";
	private static String appActivity = "com.tns.NativeScriptActivity";
	

	public  AndroidDriver<MobileElement> init_driver() {

		try
		{

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 6");
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30);
			capabilities.setCapability( "appPackage", appPackage);
			capabilities.setCapability( "appActivity", appActivity);
			tldriver.set(new AndroidDriver<MobileElement>(url, capabilities));

		}
		catch (Exception e) {
			throw new RuntimeException("appium driver could not be initialised for device ");
		}

		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return getDriver();


	}
	public static void relaunchActivity()
    {

		Activity activity = new Activity(appPackage, appActivity);
		activity.setStopApp(false);
		getDriver().startActivity(activity);

	}
	
	public static void launchMessagingApp(AndroidDriver<MobileElement> driver)
    {
		 Activity activity = new Activity("com.google.android.apps.messaging", "'com.google.android.apps.messaging.home.HomeActivity");
	     activity.setStopApp(false);
	     driver.startActivity(activity);
	}
	

	public static synchronized AndroidDriver<MobileElement> getDriver() {

		return tldriver.get();	
	}

	public static void clickAndroidBackBtn() {
		getDriver().pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	}


	public static void waitForPageToLoad()
	{
		try {
			Thread.sleep(PAGE_LOAD_TIMEOUT);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	
}
