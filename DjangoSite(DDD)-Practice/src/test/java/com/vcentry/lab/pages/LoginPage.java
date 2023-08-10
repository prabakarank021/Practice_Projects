package com.vcentry.lab.pages;

import com.relevantcodes.extentreports.LogStatus;
import com.vcentry.lab.initializer.Finder;
import com.vcentry.lab.initializer.Initializer;

public class LoginPage extends Initializer{

	public static void enterUsername(String username) {
		Finder.findById("LOGINPAGE_TYPE_USERNAME_ID").sendKeys(username);
		log.log(LogStatus.PASS, "enter username completed");
	}

	public static void enterPassword(String password) {
		Finder.findById("LOGINPAGE_TYPE_PASSWORD_ID").sendKeys(password);
		log.log(LogStatus.PASS, "enter password completed");
	}

	public static void clickLoginButton() {
		Finder.findByXpath("LOGINPAGE_TYPE_LOGINBUTTON_XPATH").click();
		log.log(LogStatus.PASS, "click login button completed");
	}

}
