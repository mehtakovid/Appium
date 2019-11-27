package AppiumAutomation.AppiumAutomation;

import org.openqa.selenium.By;

public class InstagramHomePageLocators {
	
	By Insta_Header = By.xpath("//*[@content-desc='Scroll to top']");
	By Insta_Home = By.xpath("//android.widget.ImageView[@bounds='[72,1668][144,1740]'][@resource-id='com.instagram.android:id/tab_icon']");
	By firstHandleName = By.xpath("//*[@resource-id='com.instagram.android:id/row_feed_photo_media_metadata']");
	By Insta_Search = By.xpath("//*[@content-desc='Search and Explore']");
	By Insta_Notifications = By.xpath("//*[@content-desc='Activity']");
	By Insta_Messages = By.id("com.instagram.android:id/action_bar_inbox_button");
	By User_profile = By.xpath("//*[@content-desc='Profile']");
}
