package Gmail;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gamil_Login {

	
	
	
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver Driver =new ChromeDriver();
		
		Driver.get("https://www.gmail.com");
		Driver.manage().window().maximize();

		Driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		Driver.findElement(By.id("identifierId")).sendKeys("");//put Login username
		
		Driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		Driver.findElement(By.name("password")).sendKeys("");//put login password
		Driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
		Driver.findElement(By.xpath("//div[@class='z0']/div")).click();
//Thread.sleep(4000);
		
		Hold.waitt(Driver, By.name("to"));
		
		Driver.findElement(By.name("to")).sendKeys("");//put receiver mail id
		Driver.findElement(By.xpath("//input[@class='aoT']")).sendKeys("Automated Mail");
		Driver.findElement(By.cssSelector("div[role='textbox']")).sendKeys("Do Not Reply as it is automated generated mail");
		//.sleep(4000);
		Hold.waitt(Driver, By.xpath("//tr[@class='btC']"));
		WebElement emoji=Driver.findElement(By.xpath("//tr[@class='btC']"));
		//Thread.sleep(4000);
		Hold.waitt(Driver, By.xpath("//div[@class='bAK']/div[3]/div"));
		emoji.findElement(By.xpath("//div[@class='bAK']/div[3]/div")).click();
		
	
	
	WebElement w1=Driver.findElement(By.xpath("//div[@class='a8E']/button"));
	int size=	w1.findElements(By.xpath("//div[@class='a8E']/button")).size();
		
		for(int i=0;i<size;i++){
			
			String emojitype=w1.findElements(By.xpath("//div[@class='a8E']/button")).get(i).getAttribute("title");
			
					
			
			if(emojitype.equalsIgnoreCase("Show nature emoticons")) {
				w1.findElements(By.xpath("//div[@class='a8E']/button")).get(i).click();
			}
		}
		int size2=w1.findElements(By.xpath("//div[@class='wVboN'][3]/button")).size();
for(int j=0;j<size2;j++) {
	String emojiname=w1.findElements(By.xpath("//div[@class='wVboN'][3]/button")).get(j).getAttribute("aria-label");
	if(emojiname.equalsIgnoreCase("monkey")) {
		w1.findElements(By.xpath("//div[@class='wVboN'][3]/button")).get(j).click();
w1.findElement(By.xpath("//div[@class='a8C']/button")).click();
	}
}
	
emoji.findElement(By.xpath("//div[@class='bAK']/div[1]/div")).click();
ClickScreenshot.page_screenshot(Driver);

Upload.uploadFileWithRobot("D:\\error.png");
//Thread.sleep(3000);
Hold.waitt(Driver, By.xpath("//div[@class='dC']/div[@role='button'][1]"));
emoji.findElement(By.xpath("//div[@class='dC']/div[@role='button'][1]")).click();
int size1=Driver.findElements(By.xpath("//div[@class='aio UKr6le']")).size();


for(int k=0;k<size1;k++) {
String Option=	Driver.findElements(By.xpath("//div[@class='aio UKr6le']/span/a")).get(k).getAttribute("title");
	
if(Option.equalsIgnoreCase("Sent")) {
Driver.findElements(By.xpath("//div[@class='aio UKr6le']/span")).get(k).click();
	}}

	//Thread.sleep(4000);
	Hold.waitt(Driver, By.xpath("//div[2]/div/div[@class='Cp']/div/table/tbody"));
	WebElement we2=Driver.findElement(By.xpath("//div[2]/div/div[@class='Cp']/div/table/tbody"));
	for(int l=0;l<we2.findElements(By.xpath("tr[@jsmodel='nXDxbd']/td[6]/div/div/div/span/span")).size();l++) {
	String Subject=we2.findElements(By.xpath("tr[@jsmodel='nXDxbd']/td[6]/div/div/div/span/span")).get(l).getText();
	
	if(Subject.equalsIgnoreCase("Automated Mail")) {
		we2.findElements(By.xpath("tr[@jsmodel='nXDxbd']/td[6]/div/div/div/span/span")).get(l).click();	
	}
	}}
}

