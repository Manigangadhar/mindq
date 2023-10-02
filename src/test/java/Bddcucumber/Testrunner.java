package Bddcucumber;
import org.testng.annotations.AfterClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"feature"},
                 glue =     {"Stepdefinationpackage"},
                 plugin =    { "pretty",
                  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                  tags=     "@login",
                     monochrome = true )
public class Testrunner extends AbstractTestNGCucumberTests{
			         }

