package com.vcentry.lab.pages;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;

import com.vcentry.lab.base.Base;
import com.vcentry.lab.base.Locators;

public class CompletePage extends Base{

	public static void verifyCompletePage(String expectedText) {
		Set<String> window= wd.getWindowHandles();
		Iterator<String> it= window.iterator();
		String parentId=it.next();
		String childId=it.next();
		wd.switchTo().window(childId);
		String actualText=Locators
				.findElement_ByXpath("completepage_verify_complete_xpath")
				.getText();
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Successfully verified complete page");
	}
}
