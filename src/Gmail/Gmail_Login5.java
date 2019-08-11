package Gmail;

import java.awt.AWTException;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login5 {

	
	
	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://www.gmail.com");
		Driver.manage().window().maximize();

		Driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		Driver.findElement(By.id("identifierId")).sendKeys("");//put Login username
		
		Driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		Driver.findElement(By.name("password")).sendKeys("");//put login password
		Driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
		Driver.findElement(By.xpath("//span[@class='gb_Ba gbii']")).click();
		
		WebElement we=Driver.findElement(By.xpath("//div[@class='gb_Ca gbip']"));
		we.findElement(By.xpath("//div[@class='gb_Ca gbip']")).click();
		Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@allow='camera']")));
		//System.out.println(Driver.findElements(By.tagName("iframe")).size());
		Driver.findElement(By.className("kf-kq-Dq")).click();
		
		
		Upload.uploadFileWithRobot("D:\\ash.png");
		//WebElement we3=Driver.findElement(By.xpath("//div[@class='kf-Mk-eb.kf-Nn-eb']"));
		Thread.sleep(5000);
		Driver.findElement(By.xpath("//div[@id='editbar-rotate-left']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//div[@id='editbar-rotate-left']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//div[@id='editbar-rotate-left']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//div[@id='editbar-rotate-left']")).click();
		Driver.findElement(By.xpath("//div[@id='picker:ap:3']")).click();
	}
}
