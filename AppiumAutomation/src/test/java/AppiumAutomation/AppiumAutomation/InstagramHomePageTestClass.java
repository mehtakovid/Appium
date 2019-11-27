package AppiumAutomation.AppiumAutomation;

import org.testng.annotations.Test;

public class InstagramHomePageTestClass extends BaseClass {
	
	
	
	@Test(priority=1,enabled=true)
	public void ValidateUserLoginTest() {
		InstagramHomePageLogic TS1 = new InstagramHomePageLogic(driver,wait);
		TS1.ValidateUserLogin();	
	}
	
	@Test(priority=2,enabled=true)
	public void getFirstHandleName() {
		InstagramHomePageLogic TS1 = new InstagramHomePageLogic(driver,wait);
		TS1.getHandleNameofFirstPost();
	}

	@Test(priority=3,enabled=true)
	public void performSearchOnInstagram() {
		InstagramHomePageLogic TS1 = new InstagramHomePageLogic(driver,wait);
		TS1.goToSearch();
		TS1.GoToHomeScreen();
	}
	
	@Test(priority=4,enabled=true)
	public void checkInstagramNotifications() {
		InstagramHomePageLogic TS1 = new InstagramHomePageLogic(driver,wait);
		TS1.goToNotifications();
		TS1.GoToHomeScreen();
	}
	
	@Test(priority=5,enabled=true)
	public void openInstagramMessages() {
		InstagramHomePageLogic TS1 = new InstagramHomePageLogic(driver,wait);
		TS1.OpenMessages();
		TS1.GoToHomeScreen();
	}
	
	@Test(priority=6,enabled=true)
	public void opneUserProfile() {
		InstagramHomePageLogic TS1 = new InstagramHomePageLogic(driver,wait);
		TS1.goToLoggedInUserProfile();
		TS1.GoToHomeScreen();
	}

}
