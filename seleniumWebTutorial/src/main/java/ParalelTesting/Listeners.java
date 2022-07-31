package ParalelTesting;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;


public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onFinish(ITestContext context)  {
        Utils.zip(System.getProperty("user.dir")+"\\screenshot\\AppScreenshots");
        ParalelTesting.MonitoringMail mail = new MonitoringMail();
        try {
            mail.sendMail(TestConfig.server,TestConfig.from,TestConfig.to, TestConfig.subject,TestConfig.messageBody,TestConfig.attachmentPath, TestConfig.attachmentName);
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Capturing Screenshot for the failed"  + result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Passed test" + result.getName());
    }
}
