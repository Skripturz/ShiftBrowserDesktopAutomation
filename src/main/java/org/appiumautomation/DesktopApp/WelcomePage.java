package org.appiumautomation.DesktopApp;

public class WelcomePage {
	
	public static void clickOnPrivactCheckBox() {

		BaseSteps.clickElement("welcomePage", "privacyPolicyCheckBox", 8);

	}

	public static void clickonSignInButton() {

		BaseSteps.clickElement("welcomePage", "signInWithGoogleButton", 6);

	}

	public static void welcomeScreen() {

		clickOnPrivactCheckBox();
		clickonSignInButton();

	}

}
