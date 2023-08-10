package com.vcentry.lab.organizer;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import com.vcentry.lab.base.Base;

import io.cucumber.java.Scenario;

public class ScreenshotGenerator extends Base{

	public static void generateScreenshot(Scenario s) throws IOException {
		if(s.isFailed()) {
			Reporter.log("Test case fail");
			takeScreenshot(s.getName());
		} else {
			Reporter.log("Test case pass");
			takeScreenshot(s.getName());
		}
	}
	
	public static void takeScreenshot(String name) throws IOException {
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Batch 256\\Z2_MakeMyTrip\\screenshot\\"+name+".png");
		FileHandler.copy(src, dst);
	}
}
