package com.vcentry.lab.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@validRoundtrip"
           , features = {"src\\test\\resources\\com\\vcentry\\lab\\feature"}
           , glue = {"com.vcentry.lab.testcases"}, plugin = {"pretty","html:reports/MakeMyTrip.html"}
           )
public class MakeMyTripRunner extends AbstractTestNGCucumberTests{

}