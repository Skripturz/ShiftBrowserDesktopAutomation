package org.appiumautomation.DesktopApp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DesktopApp {
	
	@BeforeClass
	public static void setWindowsCapabilities() {

		BaseSteps.initiateDriverProperties();

	}
	
	@Test(priority = 1)
	public static void lauchApp() {

		WelcomePage.welcomeScreen();
		
	}
	
	@Test(priority = 2)
	public static void enterCredentials() {

		EnterCredentialsPage.enterCredentials();

	}
	
	@Test(priority = 3)
	public static void addingWorkspace() {

		WorkspacePage.addingWorkspace();

	}
	
	@Test(priority = 4)
	public static void addingMessenger() {

		MessengerPage.addMessenger();
	}
	
	@AfterClass
	public static void tearDownSteps() {

		BaseSteps.exitApplication();

	}
	

}
