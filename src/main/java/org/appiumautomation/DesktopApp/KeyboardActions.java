package org.appiumautomation.DesktopApp;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class KeyboardActions {
	
	public static Robot robot;
	
	public static void pressEndkey(int time) {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {

		}
		try {
			robot = new Robot();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i=0;i<=time;i++) {
		robot.keyPress(KeyEvent.VK_END);
		}
	}
	
	public static void pressEnterkey(int time) {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {

		}
		try {
			robot = new Robot();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i=0;i<=time;i++) {
		robot.keyPress(KeyEvent.VK_ENTER);
		}
	}
	
	public static void pressTabkey(int time) {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {

		}
		try {
			robot = new Robot();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i=0;i<=time;i++) {
		robot.keyPress(KeyEvent.VK_TAB);
		}
	}
	
	public static void sendkeyMessenger() {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {

		}
		try {
			robot = new Robot();
		} catch (Exception e) {
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_E);
		BaseSteps.waitforvisible();
		robot.keyPress(KeyEvent.VK_S);
		BaseSteps.waitforvisible();
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_R);
	}

}
