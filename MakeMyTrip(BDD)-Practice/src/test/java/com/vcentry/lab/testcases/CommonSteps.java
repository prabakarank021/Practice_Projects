package com.vcentry.lab.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.vcentry.lab.base.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonSteps extends Base {

	@Given("open browser")
	public void open_browser() throws FileNotFoundException, IOException {
		initializer();
	}

	@When("load url")
	public void load_url() {
		wd.get(envProp.getProperty("url"));
	}

}
