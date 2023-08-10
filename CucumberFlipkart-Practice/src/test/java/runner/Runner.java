package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@runApp",features="src/test/resources/feature",glue="testCases")
public class Runner {

}
