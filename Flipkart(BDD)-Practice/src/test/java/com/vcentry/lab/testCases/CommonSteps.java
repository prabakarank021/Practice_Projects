package com.vcentry.lab.testCases;

import java.io.FileNotFoundException;
import java.io.IOException;
import com.vcentry.lab.initializer.Initialize;
import com.vcentry.lab.pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonSteps extends Initialize{

	@Given ("open browser")
	public void openBrowser() throws FileNotFoundException, IOException {
		initializer();
	}
	
	@When ("enter url")
	public void enterUrl() {
		wd.get(envProp.getProperty("URL"));
	}
	
	@Then ("close register page")
	public void closeRegisterPage() {
		RegisterPage.closeRegisterPage();
	}
}