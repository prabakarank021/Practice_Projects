package com.vcentry.lab.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// junit + testNg - DDD    - Cucumber + testNg - BDD
//@Runwith(Cucumber.class) - AbstractTestNGCucumberTests

@CucumberOptions(tags="@order", features = {"@failed/failed-testng.txt"}, glue = {"com.vcentry.lab.testCases"},

           plugin={"pretty:reports/failed.html"})

public class FailedRunner extends AbstractTestNGCucumberTests{
//  Retry for BDD
//  features="@failed/failed-testng.txt" - Give the failed test case location
}