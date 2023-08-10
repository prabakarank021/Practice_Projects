package com.vcentry.lab.pages;

import com.vcentry.lab.initializer.Finder;

public class HomePage {

	public static void searchProduct(String data) {

		Finder.findByName("HOMEPAGE_TYPE_SEARCHPRODUCT_NAME").sendKeys(data);
		Finder.findByName("HOMEPAGE_TYPE_SEARCHPRODUCT_NAME").submit();
	}
}
