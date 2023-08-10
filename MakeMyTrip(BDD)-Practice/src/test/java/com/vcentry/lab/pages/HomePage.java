package com.vcentry.lab.pages;

import com.vcentry.lab.base.Base;
import com.vcentry.lab.base.DriverFunction;
import com.vcentry.lab.base.Locators;

public class HomePage extends Base{

	public static void clickRoundTripOption() {
		DriverFunction.jseClick(Locators
				.findElement_ByXpath("homepage_click_roundtrip_xpath"));
	}
}
