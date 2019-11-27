package AppiumAutomation.AppiumAutomation;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class InstagramHomePageLogic extends InstagramHomePageLocators {
	
	public AppiumDriver<MobileElement> driver;
	public WebDriverWait wait;
	
	
	public InstagramHomePageLogic(AppiumDriver<MobileElement> driver, WebDriverWait wait) {
		this.wait=wait;
		this.driver=driver;
	}
	
	public void ValidateUserLogin() {
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Insta_Header)).isDisplayed();
		System.out.println(driver.getPageSource());
		}
		catch(Exception e){
			System.out.println("Not Logged into Instagram.");
			}
		}
	
	public void GoToHomeScreen() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Insta_Home)).click();
	}
	
	public void getHandleNameofFirstPost() {
		String handleName =wait.until(ExpectedConditions.visibilityOfElementLocated(firstHandleName)).getText();
		System.out.println("Handle Name of First Post is : "+handleName);
	}
	
	public void goToSearch() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Insta_Search)).click();
	}

	public void goToNotifications() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Insta_Notifications)).click();
	}
	
	public void OpenMessages() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Insta_Messages)).click();
	}
	
	public void goToLoggedInUserProfile() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(User_profile)).click();
	}
}
