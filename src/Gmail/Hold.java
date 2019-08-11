package Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hold {

	
	
	
	
	public static void waitt(WebDriver Driver,By by) {
		
	WebDriverWait w=new WebDriverWait(Driver,6);	
	w.until(ExpectedConditions.visibilityOfElementLocated(by));
		
	}
}
