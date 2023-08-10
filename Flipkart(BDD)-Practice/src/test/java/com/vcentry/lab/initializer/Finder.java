package com.vcentry.lab.initializer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Finder extends Initialize {

	public static WebElement findByName(String Key) {
		try {
			return wd.findElement(By.name(locatorProp.getProperty(Key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by name - " + Key);
		}
		return null;
	}

	public static WebElement findById(String Key) {
		try {
			return wd.findElement(By.id(locatorProp.getProperty(Key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by id - " + Key);
		}
		return null;
	}

	public static WebElement findByXpath(String Key) {
		try {
			return wd.findElement(By.xpath(locatorProp.getProperty(Key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by xpath - " + Key);
		}
		return null;

	}

	public static WebElement findByCssSelector(String Key) {
		try {
			return wd.findElement(By.cssSelector(locatorProp.getProperty(Key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by cssSelector - " + Key);
		}
		return null;

	}

	public static WebElement findByLinkText(String Key) {
		try {
			return wd.findElement(By.linkText(locatorProp.getProperty(Key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by linkText - " + Key);
		}
		return null;
	}

	public static WebElement findByPartialLinkText(String Key) {
		try {
			return wd.findElement(By.partialLinkText(locatorProp.getProperty(Key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by partialLinkText - " + Key);
		}
		return null;
	}

	public static WebElement findByClassName(String Key) {
		try {
			return wd.findElement(By.className(locatorProp.getProperty(Key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by className - " + Key);
		}
		return null;
	}

	public static WebElement findByTagName(String Key) {
		try {
			return wd.findElement(By.tagName(locatorProp.getProperty(Key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by tagName - " + Key);
		}
		return null;
	}
	
	public static List<WebElement> findElementsByName(String Key) {
		try {
			return wd.findElements(By.name(locatorProp.getProperty(Key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by name - " + Key);
		}
		return null;
	}

	public static List<WebElement> findElementsById(String Key) {
		try {
			return wd.findElements(By.id(locatorProp.getProperty(Key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by id - " + Key);
		}
		return null;
	}

	public static List<WebElement> findElementsByXpath(String Key) {
		try {
			return wd.findElements(By.xpath(locatorProp.getProperty(Key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by xpath - " + Key);
		}
		return null;

	}

	public static List<WebElement> findElementsByCssSelector(String Key) {
		try {
			return wd.findElements(By.cssSelector(locatorProp.getProperty(Key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by cssSelector - " + Key);
		}
		return null;

	}

	public static List<WebElement> findElementsByLinkText(String Key) {
		try {
			return wd.findElements(By.linkText(locatorProp.getProperty(Key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by linkText - " + Key);
		}
		return null;
	}

	public static List<WebElement> findElementsByPartialLinkText(String Key) {
		try {
			return wd.findElements(By.partialLinkText(locatorProp.getProperty(Key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by partialLinkText - " + Key);
		}
		return null;
	}

	public static List<WebElement> findElementsByClassName(String Key) {
		try {
			return wd.findElements(By.className(locatorProp.getProperty(Key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by className - " + Key);
		}
		return null;
	}

	public static List<WebElement> findElementsByTagName(String Key) {
		try {
			return wd.findElements(By.tagName(locatorProp.getProperty(Key)));
		} catch (Exception e) {
			System.out.println("Log - unable to find element by tagName - " + Key);
		}
		return null;
	}
}
