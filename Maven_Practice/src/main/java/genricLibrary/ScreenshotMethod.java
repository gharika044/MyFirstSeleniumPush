package genricLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotMethod {
	
	public static String screenshot(WebDriver driver)
	{
		LocalDateTime datetime =LocalDateTime.now();
		String scteenshotName =datetime.toString().replace(":", "-");
		
		String filepath ="./Screenshots/"+scteenshotName+".png";
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File temp =ts.getScreenshotAs(OutputType.FILE);
		File dest =new File(filepath);
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return filepath;
			
	}
	

}
