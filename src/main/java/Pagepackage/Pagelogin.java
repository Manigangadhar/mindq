package Pagepackage;

import org.openqa.selenium.By;

import Basepackage.BaseClass;

public class Pagelogin extends BaseClass{
	
	public static By emailinputbox = By.xpath("//input[@id='user_email']");
	public static By passwordinputbox =By.xpath("//input[@id='user_password']");
	public static By submitbutton = By.xpath("//input[@type='submit']");
	public static By invaliderrormessage= By.xpath("//p[text()='Invalid email or password.']");
	
	public  static void EnterEmailid(String args1)
	{
		driver.findElement(emailinputbox).sendKeys(args1);
	}
	public static void Enterpassword(String args2)
	{
		driver.findElement(passwordinputbox).sendKeys(args2);
	}
	public static void submit()
	{
		driver.findElement(submitbutton).click();
	}
	public String captureerrormessage()
	{
		return driver.findElement(invaliderrormessage).getText();
	}
	public static void closeapplication()
	{
		driver.close();
	}

}
