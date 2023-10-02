package Stepdefinationpackage;


import java.io.IOException;

import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Pagepackage.Pagelogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ReportingManager;

public class LoginStepdef extends Pagelogin {

	@Given("^User is in login page$")
	public static void User_is_in_login_page() throws IOException, InterruptedException
	{
		applicationlaunch();
		ExtentCucumberAdapter.addTestStepLog("Application launched successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.CaptureScreenshot());
		Thread.sleep(2000);
	}
	@When("^User enters email id \"([^\"]*)\"$")
	public static void  User_enters_email_id(String Strarg1) throws IOException
	{
		EnterEmailid(Strarg1);
		ExtentCucumberAdapter.addTestStepLog("Emailis enters successfully:");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.CaptureScreenshot());
	}
	  @And("^User enters password \"([^\"]*)\"$")
    public void User_enters_password(String Strarg2) throws IOException
    {
		Enterpassword(Strarg2);
		ExtentCucumberAdapter.addTestStepLog("password enters successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.CaptureScreenshot());
		
    }
	@And("^User clicks the signin button$")
	public static void User_clicks_the_signin_button() throws IOException
	{
		submit();
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.CaptureScreenshot());
		
		
	}
	@Then ("^close application$")
	public static void close_application()
	{
		closeapplication();
	}
  @Then("^User should see error message on the screen$")
	public void User_should_see_error_message_on_the_screen()
	{
	  String actual = captureerrormessage().trim();
	  String expected = "Invalid email or password.";
	  SoftAssert sa  = new SoftAssert();
	  sa.assertEquals(actual, expected);
	  sa.assertAll();
	}
			
}
