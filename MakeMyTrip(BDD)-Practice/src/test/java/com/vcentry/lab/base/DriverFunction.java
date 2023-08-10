package com.vcentry.lab.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFunction extends Base {

	public static void explicitWaitByXpath(String locator) {
		WebDriverWait wait = new WebDriverWait(wd, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOf(Locators.findElement_ByXpath(locator)));
	}

	public static void explicitWaitById(WebElement locator) {
		WebDriverWait wait = new WebDriverWait(wd, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOf(locator));
	}

	public static void explicitWaitByName(String locator) {
		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name(locator)));
		wait.until(ExpectedConditions.elementToBeClickable(By.name(locator)));
	}

	public static void explicitWaitByCss(String locator) {
		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
	}

	public static void jseClick(WebElement clickElement) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) wd;
			jse.executeScript("arguments[0].click()", clickElement);
		} catch (JavascriptException e) {
			System.out.println("Log: Faild java script: " + e.getMessage());
		}
	}

	public static void jseSendkeys(WebElement sendKeysElement, String sendkeysValue) {
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("arguments[0].value='" + sendkeysValue + "'", sendKeysElement);
	}

	public static void robotClass(int keyEvent) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(keyEvent);
	}

	public static void jseScrollIntoView(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void checkBoxSelect(WebElement element) {
		if (element.isDisplayed()) {
			System.out.println("Yes element is displayed");
		} else {
			System.out.println("No element is not displayed");
		}
		if (element.isEnabled()) {
			System.out.println("Yes element is enabled");
		} else {
			System.out.println("No element is not enabled");
		}
		if (element.isSelected()) {
			System.out.println("Yes element is selected");
		} else {
			System.out.println("No element is not selected");
			jseClick(element);
		}
	}
}
