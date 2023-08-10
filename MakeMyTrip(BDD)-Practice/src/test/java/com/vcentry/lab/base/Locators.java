package com.vcentry.lab.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	public static WebElement findElement_ById(String Id) {
		try {
			return wd.findElement(By.id(locatorProp.getProperty(Id)));
		} catch (NoSuchElementException e) {
			System.out.println("Log : Unable to find the element by id - " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Log : Unable to interact the element by id - " + e.getMessage());
		}
		return null;
	}

	public static WebElement findElement_ByName(String Name) {
		try {
			return wd.findElement(By.name(locatorProp.getProperty(Name)));
		} catch (NoSuchElementException e) {
			System.out.println("Log : Unable to find the element by Name - " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Log : Unable to interact the element by Name - " + e.getMessage());
		}
		return null;
	}

	public static WebElement findElement_ByXpath(String Xpath) {
		try {
			return wd.findElement(By.xpath(locatorProp.getProperty(Xpath)));
		} catch (NoSuchElementException e) {
			System.out.println("Log : Unable to find the element by Xpath - " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Log : Unable to interact the element by Xpath - " + e.getMessage());
		}
		return null;
	}

	public static WebElement findElement_ByCssSelector(String CssSelector) {
		try {
			return wd.findElement(By.cssSelector(locatorProp.getProperty(CssSelector)));
		} catch (NoSuchElementException e) {
			System.out.println("Log : Unable to find the element by CssSelector - " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Log : Unable to interact the element by CssSelector - " + e.getMessage());
		}
		return null;
	}

	public static WebElement findElement_ByLinkText(String LinkText) {
		try {
			return wd.findElement(By.linkText(locatorProp.getProperty(LinkText)));
		} catch (NoSuchElementException e) {
			System.out.println("Log : Unable to find the element by LinkText- " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Log : Unable to interact the element by LinkText- " + e.getMessage());
		}
		return null;
	}

	public static WebElement findElement_ByPartialLinkText(String partialLinkText) {
		try {
			return wd.findElement(By.partialLinkText(locatorProp.getProperty(partialLinkText)));
		} catch (NoSuchElementException e) {
			System.out.println("Log : Unable to find the element by partialLinkText- " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Log : Unable to interact the element by partialLinkText- " + e.getMessage());
		}
		return null;
	}

	public static WebElement findElement_ByClassName(String className) {
		try {
			return wd.findElement(By.className(locatorProp.getProperty(className)));
		} catch (NoSuchElementException e) {
			System.out.println("Log : Unable to find the element by className- " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Log : Unable to interact the element by className- " + e.getMessage());
		}
		return null;
	}

	public static WebElement findElement_ByTagName(String Tagname) {
		try {
			return wd.findElement(By.tagName(locatorProp.getProperty(Tagname)));
		} catch (NoSuchElementException e) {
			System.out.println("Log : Unable to find the element by tagname- " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Log : Unable to interact the element by tagname- " + e.getMessage());
		}
		return null;
	}

	public static List<WebElement> findElements_ById(String Id) {
		try {
			return wd.findElements(By.id(locatorProp.getProperty(Id)));
		} catch (NoSuchElementException e) {
			System.out.println("Log : Unable to find the element by id - " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Log : Unable to interact the element by id - " + e.getMessage());
		}
		return null;
	}

	public static List<WebElement> findElements_ByName(String Name) {
		try {
			return wd.findElements(By.name(locatorProp.getProperty(Name)));
		} catch (NoSuchElementException e) {
			System.out.println("Log : Unable to find the element by Name - " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Log : Unable to interact the element by Name - " + e.getMessage());
		}
		return null;
	}

	public static List<WebElement> findElements_ByXpath(String Xpath) {
		try {
			return wd.findElements(By.xpath(locatorProp.getProperty(Xpath)));
		} catch (NoSuchElementException e) {
			System.out.println("Log : Unable to find the element by Xpath - " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Log : Unable to interact the element by Xpath - " + e.getMessage());
		}
		return null;
	}

	public static List<WebElement> findElements_ByCssSelector(String CssSelector) {
		try {
			return wd.findElements(By.cssSelector(locatorProp.getProperty(CssSelector)));
		} catch (NoSuchElementException e) {
			System.out.println("Log : Unable to find the element by CssSelector - " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Log : Unable to interact the element by CssSelector - " + e.getMessage());
		}
		return null;
	}

	public static List<WebElement> findElements_ByLinkText(String LinkText) {
		try {
			return wd.findElements(By.linkText(locatorProp.getProperty(LinkText)));
		} catch (NoSuchElementException e) {
			System.out.println("Log : Unable to find the element by LinkText- " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Log : Unable to interact the element by LinkText- " + e.getMessage());
		}
		return null;
	}

	public static List<WebElement> findElements_ByPartialLinkText(String partialLinkText) {
		try {
			return wd.findElements(By.partialLinkText(locatorProp.getProperty(partialLinkText)));
		} catch (NoSuchElementException e) {
			System.out.println("Log : Unable to find the element by partialLinkText- " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Log : Unable to interact the element by partialLinkText- " + e.getMessage());
		}
		return null;
	}

	public static List<WebElement> findElements_ByClassName(String className) {
		try {
			return wd.findElements(By.className(locatorProp.getProperty(className)));
		} catch (NoSuchElementException e) {
			System.out.println("Log : Unable to find the element by className- " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Log : Unable to interact the element by className- " + e.getMessage());
		}
		return null;
	}

	public static List<WebElement> findElements_ByTagName(String Tagname) {
		try {
			return wd.findElements(By.tagName(locatorProp.getProperty(Tagname)));
		} catch (NoSuchElementException e) {
			System.out.println("Log : Unable to find the element by tagname- " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Log : Unable to interact the element by tagname- " + e.getMessage());
		}
		return null;
	}
}
