package Gmail;






import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ClickScreenshot {

	
	
	
	
	
	public static void page_screenshot(WebDriver d) throws IOException{
		File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(src, new File(""));//put local path
	}

	
	
	
}




