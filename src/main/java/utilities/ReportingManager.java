package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Basepackage.BaseClass;

public class ReportingManager {
	
	public static String CaptureScreenshot() throws IOException
	{
		String Screenshotpath = " ";
		
		TakesScreenshot obj = ((TakesScreenshot)BaseClass.driver);
		File sourcefile = obj.getScreenshotAs(OutputType.FILE);
		
		
	File destinationpath = new File("C://Ram//"+"ScreenCapture"+ System.currentTimeMillis()+ ".png");
	 
	FileUtils.copyFile(sourcefile, destinationpath);
	
	Screenshotpath = destinationpath.getAbsolutePath();
	return Screenshotpath;
	
	}

}
