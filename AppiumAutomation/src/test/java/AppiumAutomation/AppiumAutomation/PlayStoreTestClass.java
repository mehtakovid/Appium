package AppiumAutomation.AppiumAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PlayStoreTestClass {
	
public static void main(String[] args) {
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "MotoG5s Plus");
		caps.setCapability("udid", "ZY322DDKVG"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "8.1.0");
		caps.setCapability("appPackage", "com.android.vending");
		caps.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try {
				AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
//				driver.findElement(By.id("com.android.vending:id/search_bar_hint")).click();
//				driver.findElement(By.id("com.android.vending:id/search_bar_text_input")).sendKeys("pubg");
//				driver.findElement(By.id("com.android.vending:id/suggest_text")).click();
//				driver.findElement(By.xpath("//*[@content-desc='App:PUBG MOBILETencent Games1.8 GB']")).click();
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}

}
