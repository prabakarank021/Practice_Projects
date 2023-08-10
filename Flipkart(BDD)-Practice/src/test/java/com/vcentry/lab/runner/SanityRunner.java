package com.vcentry.lab.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// junit + testNg - DDD    - Cucumber + testNg - BDD
//@Runwith(Cucumber.class) - AbstractTestNGCucumberTests

@CucumberOptions(tags="@order", features = {"src/test/resources/features"}, glue = {"com.vcentry.lab.testCases"},

           plugin={"pretty:reports/failed.html", "rerun:failed/failed-testng.txt"})

public class SanityRunner extends AbstractTestNGCucumberTests{
//  Rerun for BDD
//  "rerun:target" - It will store the failed test cases in target folder - temp folder delete every single time we run the test cases
//	"rerun:failed" - It will store the failed test cases in failed folder - constant never delete
//  BDD failed case rerun         - DDD failed case rerun                
//	failed-testng.txt(customized) - failed-testng.xml(default)
}