package org.appiumautomation.DesktopApp;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;

public class BaseSteps {
	
	public static WindowsDriver winDriver;

	public static String property(String files, String Global) {
		Properties pro = new Properties();
		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "\\Locators\\Locators.properties");
			pro.load(file);
			String browserurl = pro.getProperty(files);
			FileInputStream Locator = new FileInputStream(System.getProperty("user.dir") + browserurl);
			pro.load(Locator);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String variable = pro.getProperty(Global);
		return variable;
	}

	public static WindowsDriver initiateDriverProperties() {
		Desktop desktop = Desktop.getDesktop();
		try {
			desktop.open(new File("C:\\Program Files (x86)\\Windows Application Driver\\WinAppDriver.exe"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("app", "C:\\Program Files (x86)\\Shift\\shift.exe");
		URL url = null;
		try {
			url = new URL("http://127.0.0.1:4723");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		winDriver = new WindowsDriver(url, cap);
		winDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		return winDriver;
	}

	public static void waitTillClickable(int timeout) {
		try {
			Thread.sleep(timeout * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static WebElement findElementByXpath(String pageName, String elementName, int timeout) {
		waitTillClickable(timeout);
		WebElement element = winDriver.findElementByXPath(property(pageName, elementName));
		return element;
	}
	
	public static void waitforvisible() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void exitApplication() {
		//winDriver.quit();
	}
	
	public static void clickElement(String pageName, String elementName, int timeout) {
		findElementByXpath(pageName, elementName, timeout).click();
	}
	
	public static void clickElement(String pageName, String elementName) {
		findElementByXpath(pageName, elementName, 4).click();
	}
	
	public static void SendKeys(String pageName, String elementName, int timeout, String variable) {
		findElementByXpath(pageName, elementName, 4).clear();
		findElementByXpath(pageName, elementName, timeout).sendKeys(variable);
	}

	public static void SendKeys(String pageName, String elementName, String variable) {
		findElementByXpath(pageName, elementName, 4).clear();
		findElementByXpath(pageName, elementName, 4).clear();
		findElementByXpath(pageName, elementName, 4).sendKeys(variable);
	}

	public static void getText(String pageName, String elementName, int timeout) {
		findElementByXpath(pageName, elementName, timeout).getText();
	}

	public static String getText(String pageName, String elementName) {
		return findElementByXpath(pageName, elementName, 4).getText();
	}
	
	public static WebElement findElementByName(String pageName, String elementName, int timeout) {
		waitTillClickable(timeout);
		WebElement element = winDriver.findElementByName(property(pageName, elementName));
		return element;
	}

	public static void clickElementbyName(String pageName, String elementName, int timeout) {
		findElementByName(pageName, elementName, timeout).click();
	}

	public static void clickElementbyName(String pageName, String elementName) {
		findElementByName(pageName, elementName, 4).click();
	}

	public static void SendKeysbyName(String pageName, String elementName, int timeout, String variable) {
		findElementByXpath(pageName, elementName, 4).clear();
		findElementByName(pageName, elementName, timeout).sendKeys(variable);
	}

	public static void SendKeysbyName(String pageName, String elementName, String variable) {
		findElementByXpath(pageName, elementName, 4).clear();
		findElementByName(pageName, elementName, 4).sendKeys(variable);
	}


}
