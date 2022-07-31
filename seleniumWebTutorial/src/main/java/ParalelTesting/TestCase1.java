package ParalelTesting;

import Actions.TestActions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;

import java.time.LocalDate;
import java.util.Arrays;

public class TestCase1 extends TestActions {

    public ExtentSparkReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest test;

    @BeforeMethod(groups = {"facebook", "smoke"})
    public void setUp() {
        commonSetup();
    }

    @BeforeTest
    public void setReport() {
        LocalDate date = LocalDate.now();
        htmlReporter = new ExtentSparkReporter("./reports/extent.html");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setDocumentTitle("Test Repoort" + date);
        htmlReporter.config().setReportName("Automation Test Results");
        htmlReporter.config().setTheme(Theme.DARK);
        //creating a new report
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("automation tester", "vaclav jurena");
        extent.setSystemInfo("organization", "home");
    }

    @AfterTest
    public void endReport() {
        extent.flush();
    }

    /**
     * pass, fail, skip
     */


    @Test
    public void getLinks() throws InterruptedException {
        test = extent.createTest("GetLinks");
        System.out.println("Executing Login test");
        checkPageLink(driver);
    }


    @Test
    public void invalidPassFb() {
        test = extent.createTest("Invalid Password");
        invalidPassword(driver);
        System.out.println("Executing Login test");
    }

    @Test
    public void isSkip() {
        test = extent.createTest("Skip Test");
        throw new SkipException("Skipping Testcase");
    }

    @Test
    public void doUSerRegistration() {
        test = extent.createTest("User Reg Test");
        Assert.fail("User Registration test Failed");
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            String exceptionMsg = Arrays.toString(result.getThrowable().getStackTrace());
            test.fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured: Click to see" + "</font>" + "</b>" + "</summary>"
                    + exceptionMsg.replaceAll(",", "<br>") + "</details>" + "\n");
            String failLog = "Test Case Failed";
            Markup m = MarkupHelper.createLabel(failLog, ExtentColor.RED);
            test.log(Status.FAIL, m);

        } else if (result.getStatus() == ITestResult.SKIP) {
            String methodName = result.getMethod().getMethodName();
            String logText = "<i>" + "Test Case: -" + methodName.toUpperCase() + "Passed" + "<i>";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
            test.pass(m);

        } else if (result.getStatus() == ITestResult.SUCCESS) {
            String methodName = result.getMethod().getMethodName();
            String logText = "<i>" + "Test Case: -" + methodName.toUpperCase() + "Passed" + "<i>";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
            test.pass(m);
        }
    }

    @AfterMethod
    public void tearUp() {
        driver.close();
    }

    @AfterClass
    public void quitDriver() {
        driver.quit();
    }


}








