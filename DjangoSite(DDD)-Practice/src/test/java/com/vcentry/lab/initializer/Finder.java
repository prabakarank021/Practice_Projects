package com.vcentry.lab.initializer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
public class Finder extends Initializer {

	public static WebElement findByName(String key) {
		try {
			return wd.findElement(By.name(locatorProp.getProperty(key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by name - " + key);
		}
		return null;
	}

	public static WebElement findById(String key) {
		try {
			return wd.findElement(By.id(locatorProp.getProperty(key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by id - " + key);
		}
		return null;
	}

	public static WebElement findByXpath(String key) {
		try {
			return wd.findElement(By.xpath(locatorProp.getProperty(key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by xpath - " + key);
		}
		return null;
	}

	public static WebElement findBycssSelector(String key) {
		try {
			return wd.findElement(By.cssSelector(locatorProp.getProperty(key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by cssSelector - " + key);
		}
		return null;
	}

	public static WebElement findByLinktext(String key) {
		try {
			return wd.findElement(By.linkText(locatorProp.getProperty(key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by Linktext - " + key);
		}
		return null;
	}

	public static WebElement findByPartialLinkText(String key) {
		try {
			return wd.findElement(By.partialLinkText(locatorProp.getProperty(key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by partialLinkText - " + key);
		}
		return null;
	}

	public static WebElement findByClassName(String key) {
		try {
			return wd.findElement(By.className(locatorProp.getProperty(key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by className - " + key);
		}
		return null;
	}

	public static WebElement findByTagName(String key) {
		try {
			return wd.findElement(By.tagName(locatorProp.getProperty(key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by tagName - " + key);
		}
		return null;
	}

}
