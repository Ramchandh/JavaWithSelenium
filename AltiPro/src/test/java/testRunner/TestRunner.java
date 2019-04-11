package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:/JAVA Projects/JavaWithSelenium/AltiPro/features/Login.feature", glue={"testRunner"})

public class TestRunner {

}
