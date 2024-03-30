package org.appiumautomation.DesktopApp;

import org.testng.Assert;

public class EnterCredentialsPage {
	
	public static void enterUserName() {

		BaseSteps.clickElement("credentialsPage", "userNameTextBox", 15);
		BaseSteps.SendKeys("credentialsPage", "userNameTextBox", "qa.automation.testid001@gmail.com");

	}

	public static void clickonNextButton() {

		BaseSteps.clickElement("credentialsPage", "nextButton");

	}

	public static void enterPasswordName() {

		BaseSteps.clickElement("credentialsPage", "passwordTextBox", 5);
		BaseSteps.SendKeys("credentialsPage", "passwordTextBox", "Table@123");

	}

	public static void clickonContinueButton() {

		KeyboardActions.pressEndkey(3);
		BaseSteps.clickElement("credentialsPage", "continueButton", 5);

	}

	public static void clickonAllowButton() {

		KeyboardActions.pressEndkey(1);
		BaseSteps.clickElement("credentialsPage", "allowButton", 5);

	}

	public static void verifyTitle() {

		Assert.assertTrue(BaseSteps.getText("credentialsPage", "titleName").contains("qa.automation.testid001@gmail.com"), "Title is verfied");
		
	}

	public static void enterCredentials() {

		enterUserName();
		KeyboardActions.pressEnterkey(1);
		enterPasswordName();
		KeyboardActions.pressEnterkey(1);
		KeyboardActions.pressEndkey(1);
		clickonContinueButton();
		KeyboardActions.pressEndkey(1);
		clickonAllowButton();
		verifyTitle();

	}
}
