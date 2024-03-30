package org.appiumautomation.DesktopApp;

import org.testng.Assert;

public class WorkspacePage {

	public static void clickonAddButton() {

		BaseSteps.clickElementbyName("workspacePage", "addButton", 3);

	}

	public static void clickonAddWorkspace() {

		BaseSteps.clickElementbyName("workspacePage", "addWorkSpace", 3);

	}

	public static void enterUserName() {

		BaseSteps.clickElementbyName("workspacePage", "UserNameTextBox", 3);
		BaseSteps.SendKeysbyName("workspacePage", "UserNameTextBox", "qa.automation.testid002@gmail.com");

	}

	public static void clickonCreateWorkspace() {

		BaseSteps.clickElementbyName("workspacePage", "createworkspace", 4);

	}

	public static void clickonButton() {

		BaseSteps.clickElement("workspacePage", "Close", 8);

	}

	public static void enterMailName() {

		BaseSteps.clickElementbyName("workspacePage", "nameTextBox");
		BaseSteps.SendKeysbyName("workspacePage", "nameTextBox", "qa.automation.testid002@gmail.com");

	}

	public static void clickonNextButton() {

		KeyboardActions.pressEndkey(1);
		KeyboardActions.pressTabkey(2);
		KeyboardActions.pressEnterkey(1);
	    //BaseClassSteps.clickElement("workspacePage", "nextButton", 3);

	}

	public static void enterPasswordName() {

		BaseSteps.clickElementbyName("workspacePage", "passwordTextBox");
		BaseSteps.SendKeysbyName("workspacePage", "passwordTextBox", "Table@123");
		KeyboardActions.pressEnterkey(1);

	}

	public static void clickonContinueButton() {

		KeyboardActions.pressEndkey(3);
		BaseSteps.clickElement("workspacePage", "continueButton", 5);

	}

	public static void clickonAllowButton() {

		KeyboardActions.pressEndkey(1);
		BaseSteps.clickElement("workspacePage", "allowButton", 5);

	}

	public static void verifyTitle() {

		Assert.assertTrue(BaseSteps.getText("workspacePage", "titleName").contains("qa.automation.testid002@gmail.com"),
				"Title is verfied");

	}

	public static void addingWorkspace() {

		clickonAddButton();
		clickonAddWorkspace();
		enterUserName();
		clickonCreateWorkspace();
		clickonButton();
		clickonNextButton();
		enterPasswordName();
		KeyboardActions.pressEnterkey(1);
		KeyboardActions.pressEndkey(1);
		clickonContinueButton();
		KeyboardActions.pressEndkey(1);
		clickonAllowButton();
		verifyTitle();

	}

}
