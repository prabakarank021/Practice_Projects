package com.vcentry.lab.pages;

import com.vcentry.lab.initializer.Finder;

public class DetailsPage {

	public static String getProductName() {
		String ProductName = Finder.findByClassName("DETAILSPAGE_GETTEXT_GETPRODUCTNAME_CLASSNAME").getText();
		return ProductName;
	}

	public static String getProductPrice() {
		String ProductPrice = Finder.findByCssSelector("DETAILSPAGE_GETTEXT_GETPRODUCTPRICE_CSSSELECTOR").getText();
		return ProductPrice;
	}

	public static void clickAddToCart() {
		Finder.findByCssSelector("DETAILSPAGE_CLICK_CLICKADDTOCART_CSSSELECTOR").click();
	}

}
