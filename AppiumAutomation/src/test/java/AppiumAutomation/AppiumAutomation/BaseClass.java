package AppiumAutomation.AppiumAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	
	public static AppiumDriver<MobileElement> driver;
	public static WebDriverWait wait;
	
	
	/******
	 * udid can be fetched through adb devices in cmd
	 * Setting the AppPackage and AppActivity 
	 * using dumpsys window windows | grep -E 'mCurrentFocus'
	 * @throws MalformedURLException
	 */
	@BeforeSuite
	public void driverInitialization() throws MalformedURLException {
	
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "MotoG5s Plus");
		caps.setCapability("udid", "ZY322DDKVG"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "8.1.0");
		caps.setCapability("appPackage", "com.instagram.android");
		caps.setCapability("appActivity", "com.instagram.mainactivity.MainActivity");
		caps.setCapability("noReset", "true");
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		wait = new WebDriverWait(driver,20);
	}
	
	
	/****
	 * Closes all the active browsers
	 * and prepares the system for
	 * Garbage collection
	 */
	@AfterSuite
	public void driverTearDown() {
		driver.quit();
		driver=null;
		wait=null;
		System.gc();
	}
	

}
