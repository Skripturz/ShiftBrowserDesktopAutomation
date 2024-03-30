package org.appiumautomation.DesktopApp;

import org.junit.Assert;

public class SettingPage {
	
	public static void clickonSettingsMenu() {

		BaseSteps.clickElement("settingsPage", "settingsMenu", 7);

	}

	public static void clickonAdvanceSettingsButton() {

		BaseSteps.clickElement("settingsPage", "advanceSettingsButton", 5);

	}

	public static void verifyshiftversion() {

		clickonSettingsMenu();
		clickonAdvanceSettingsButton();
		Assert.assertTrue("Version is verfied", BaseSteps.getText("settingsPage", "shiftVersion").contains("9.2.5.1070"));
		
	}

}
