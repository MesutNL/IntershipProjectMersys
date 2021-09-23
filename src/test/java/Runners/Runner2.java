package Runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = {"@SmokeTest"},
        features = {"src/test/java/featuresFiles"},
        glue = {"stepDefinitions"},
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportSmoke.html"})


public class Runner2 extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void afterClass() {
        Reporter.loadXMLConfig("src/test/java/xmlFiles/extendReportSet.xml");

        Reporter.setSystemInfo("User Name", "Group 2");
        Reporter.setSystemInfo("Application Name", "Mersys System");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Department", "QAR");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }
}
