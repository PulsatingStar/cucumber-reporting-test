package test.java;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import frameworkUtils.ReportingUtils;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/Features/Login.feature",
        plugin ={"html:target/site/cucumber-pretty", "json:target/cucumber.json"},
        glue={""},
        tags={"@Test"},
        monochrome = true
        )


public class TestRunner extends AbstractTestNGCucumberTests{

        @AfterSuite
        public void generateReport(){
                ReportingUtils.generateJVMReport();
        }


}