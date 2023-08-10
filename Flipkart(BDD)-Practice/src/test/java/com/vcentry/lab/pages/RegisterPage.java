package com.vcentry.lab.pages;

import com.vcentry.lab.initializer.Finder;

public class RegisterPage {

	public static void closeRegisterPage() {
		Finder.findByXpath("REGISTERPAGE_CLICK_CLICKCLOSEBUTTON_XPATH").click();
	}
}
