package AppHooks;


import org.openqa.selenium.*;

import com.driverfactory.DriverFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
		private DriverFactory driverFactory;
		private AndroidDriver<MobileElement> driver;

		
		@Before(order = 1)
		public void launchApp() {
			driverFactory = new DriverFactory();
			driver = driverFactory.init_driver();

		}

		@After(order = 1)
		public void tearDown(Scenario scenario) {
			if (scenario.isFailed()) {
				// take screenshot:
				String screenshotName = scenario.getName().replaceAll(" ", "_");
				byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(sourcePath, "image/png", screenshotName);

			}
		}

}
