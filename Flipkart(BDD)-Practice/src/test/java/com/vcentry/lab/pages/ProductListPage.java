package com.vcentry.lab.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import com.vcentry.lab.initializer.Finder;

public class ProductListPage {

	public static String getFirstProductName() {
		List<WebElement> products = Finder
				.findElementsByClassName("PRODUCTLISTPAGE_GETTEXT_GETFIRSTPRODUCTNAME_CLASSNAME");
		String data = products.get(0).getText();
		return data;
	}

	public static String getFirstProductPrice() {
		List<WebElement> price = Finder
				.findElementsByCssSelector("PRODUCTLISTPAGE_GETTEXT_GETFIRSTPRODUCTPRICE_CSSSELECTOR");
		String data = price.get(0).getText();
		return data;
	}

	public static void clickFirstProductLink() {
		List<WebElement> product = Finder
				.findElementsByClassName("PRODUCTLISTPAGE_CLICK_CLICKFIRSTPRODUCTLINK_CLASSNAME");
		product.get(0).click();
	}

}
