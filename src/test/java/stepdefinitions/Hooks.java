package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import utils.ExtentReportManager;

public class Hooks {

    static ExtentReports extent = ExtentReportManager.getExtentReports();  // No error now ✅
    static ThreadLocal<ExtentTest> testThread = new ThreadLocal<>();

    @Before
    public void beforeScenario(Scenario scenario) {
        ExtentTest test = extent.createTest(scenario.getName());
        testThread.set(test);
    }

    @After
    public void afterScenario() {
        extent.flush();  // Triggers report generation
    }
}

