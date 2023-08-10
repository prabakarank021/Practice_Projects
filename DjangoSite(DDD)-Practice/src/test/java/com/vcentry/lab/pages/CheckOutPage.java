package com.vcentry.lab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.vcentry.lab.initializer.Finder;

public class CheckOutPage {

	public static void enterProductName(String productName) {
		Finder.findById("CHECKOUTPAGE_TYPE_PRODUCTNAME_ID").sendKeys(productName);
	}

	public static void enterMobile(String mobile) {
		Finder.findById("CHECKOUTPAGE_TYPE_MOBILE_ID").sendKeys(mobile);
	}

	public static void enterEmail(String email) {
		Finder.findById("CHECKOUTPAGE_TYPE_EMAIL_ID").sendKeys(email);
	}

	public static void selectProductCetagory(String productCetagory) {
		WebElement dropdown=Finder.findById("CHECKOUTPAGE_SELECT_PRODUCTCETAGORY_ID");
		Select s = new Select(dropdown);
		s.selectByVisibleText(productCetagory);
	}

	public static void enterProductQuantity(String productQuantity) {
		Finder.findById("CHECKOUTPAGE_TYPE_PRODUCTQUANTITY_ID").sendKeys(productQuantity);
	}

	public static void enterPurchaserName(String purchaserName) {
		Finder.findById("CHECKOUTPAGE_TYPE_PURCHASERNAME_ID").sendKeys(purchaserName);
	}

	public static void clickGst() {
		Finder.findById("CHECKOUTPAGE_CLICK_GSTAPPLIED_ID").click();
	}

	public static void clickAvailablePayment() {
		Finder.findById("CHECKOUTPAGE_CLICK_AVAILABLEPAYMENT_ID").click();
	}

	public static void clickPlaceOrderButton() {
		Finder.findById("CHECKOUTPAGE_CLICK_PLACEORDER_ID").click();
	}
}
