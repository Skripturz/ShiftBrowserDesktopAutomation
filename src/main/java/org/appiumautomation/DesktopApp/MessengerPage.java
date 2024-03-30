package org.appiumautomation.DesktopApp;

import org.testng.Assert;

public class MessengerPage {
	
	public static void clickonAddButton() {

		BaseSteps.clickElementbyName("messengerPage", "addButton", 4);

	}

	public static void clickonAddApplicationButton() {

		BaseSteps.clickElementbyName("messengerPage", "addApplicationButton", 2);

	}

	public static void enterSearch() {

		BaseSteps.clickElementbyName("messengerPage", "SearchTextBox", 3);
		//BaseClassSteps.SendKeysbyName("messengerPage", "SearchTextBox", "Messenger");
		KeyboardActions.sendkeyMessenger();

	}

	public static void clickonMessengerApp() {

		BaseSteps.clickElementbyName("messengerPage", "appName", 6);

	}

	public static void enterAccountName() {

		BaseSteps.clickElementbyName("messengerPage", "accountNameTextBox", 2);
		BaseSteps.SendKeysbyName("messengerPage", "accountNameTextBox", "QATest");

	}

	public static void clickonSaveButton() {

		BaseSteps.clickElementbyName("messengerPage", "saveButton", 2);

	}

	public static void verifyTitle() {

		Assert.assertTrue(BaseSteps.getText("messengerPage", "titleName").contains("qa.automation.testid002@gmail.com"),
				"Title is verfied");
	}

	public static void addMessenger() {

		clickonAddButton();
		clickonAddApplicationButton();
		enterSearch();
		clickonMessengerApp();
		enterAccountName();
		clickonSaveButton();
		verifyTitle();

	}

}
