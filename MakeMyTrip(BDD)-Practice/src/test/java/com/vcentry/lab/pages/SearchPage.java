package com.vcentry.lab.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.vcentry.lab.base.Base;
import com.vcentry.lab.base.DriverFunction;
import com.vcentry.lab.base.Locators;

public class SearchPage extends Locators{

	public static void selectFromCity(String fromCity) throws AWTException, InterruptedException {
		findElement_ByXpath("searchpage_click_frombutton_xpath").click();
		findElement_ByXpath("searchpage_type_fromcity_xpath").sendKeys(fromCity);
		DriverFunction.explicitWaitByXpath("searchpage_wait_fromfirstoption_xpath");
		findElement_ByXpath("searchpage_wait_fromfirstoption_xpath").click();

	}

	public static void selectToCity(String toCity) throws AWTException {
		findElement_ByXpath("searchpage_click_tobutton_xpath").click();
		findElement_ByXpath("searchpage_type_tocity_xpath").sendKeys(toCity);
		DriverFunction.explicitWaitByXpath("searchpage_wait_tofirstoption_xpath");
		findElement_ByXpath("searchpage_wait_tofirstoption_xpath").click();
	}

	public static void selectFromDate() {
		DriverFunction.jseClick(findElement_ByXpath("searchpage_select_fromdate_xpath"));
	}

	public static void selectToDate() {
		DriverFunction.jseClick(findElement_ByXpath("searchpage_select_todate_xpath"));
	}

	public static void selectTraveller() {
		findElement_ByXpath("searchpage_click_traveller_xpath").click();
		findElement_ByXpath("searchpage_select_adults_xpath").click();
		findElement_ByXpath("searchpage_select_children_xpath").click();
		findElement_ByXpath("searchpage_select_infants_xpath").click();
	}

	public static void selectClass() {
		findElement_ByXpath("searchpage_select_class_xpath").click();
		findElement_ByXpath("searchpage_click_applybutton_xpath").click();
	}
	
	public static void clickSearchButton() {
		findElement_ByXpath("searchpage_click_searchbutton_xpath").click();
	}
}
