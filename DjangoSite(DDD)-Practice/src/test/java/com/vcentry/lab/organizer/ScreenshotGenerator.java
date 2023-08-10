package com.vcentry.lab.organizer;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import com.relevantcodes.extentreports.LogStatus;
import com.vcentry.lab.initializer.Initializer;

public class ScreenshotGenerator extends Initializer{

	public static void generateScreenshot(ITestResult it) throws IOException{
		String TcName=it.getParameters()[0].toString();
		if (it.isSuccess()) {
			String path = takeScreenshot(TcName);
			log.log(LogStatus.PASS, TcName + " test case pass", log.addScreenCapture(path));
		} else {
			String path = takeScreenshot(it.getName());
			log.log(LogStatus.FAIL, TcName + " testcase failed", log.addScreenCapture(path));
		}
		reports.endTest(log);
		reports.flush();
	}
	
	public static String takeScreenshot(String name) throws IOException {
		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		File dst = new File("C:/Batch 256/J1_DDDTest/screenshot/"+name+".png");
		FileHandler.copy(src, dst);
//		System.out.println(dst.toString());
		return dst.toString();
	}

}
