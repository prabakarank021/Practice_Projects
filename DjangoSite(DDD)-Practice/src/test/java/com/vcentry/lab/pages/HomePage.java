package com.vcentry.lab.pages;

import com.vcentry.lab.initializer.Finder;

public class HomePage {

	public static void clickFrameworksForm(){
		Finder.findById("HOMEPAGE_CLICK_FRAMWORKSFORM_ID").click();
	}
	
	public static void clickSimpleForm(){
		Finder.findById("HOMEPAGE_CLICK_SIMPLEFORM_ID").click();
	}
	
	public static void clickLogoutButton(){
		Finder.findByLinktext("HOMEPAGE_CLICK_LOGOUT_LINKTEXT").click();
	}	
}
