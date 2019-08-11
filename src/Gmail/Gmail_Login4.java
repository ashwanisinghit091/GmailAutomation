package Gmail;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login4 {

	
	
	
	public static void main(String[] args) throws InterruptedException {
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

		Driver.findElement(By.name("to")).sendKeys("");//put receiver mail id
		Driver.findElement(By.xpath("//input[@class='aoT']")).sendKeys("Automated Mail");
		
		Hold.waitt(Driver, By.xpath("//tr[@class='btC']"));
		WebElement emoji=Driver.findElement(By.xpath("//tr[@class='btC']"));
		Hold.waitt(Driver, By.xpath("//div[@class='bAK']/div"));
		int size=emoji.findElements(By.xpath("//div[@class='bAK']/div")).size();
		for(int i=0;i<size;i++) {
		String text=emoji.findElements(By.xpath("//div[@class='bAK']/div")).get(i).getAttribute("command");
		if(text.equalsIgnoreCase("+link")) {
			
			emoji.findElements(By.xpath("//div[@class='bAK']/div")).get(i).click();
			
	}
	
	}
	WebElement we1=	Driver.findElement(By.xpath("//div[@class='Kj-JD LW-JD']"))	;
	we1.findElement(By.xpath("//input[@id='linkdialog-text']")).sendKeys("Happy Bday");
	
	we1.findElement(By.xpath("//input[@id='linkdialog-onweb-tab-input']")).sendKeys("www.fb.com");
	we1.findElement(By.xpath("//button[@name='ok']")).click();
	
	WebElement we5=Driver.findElement(By.xpath("//td[@class='Hm']"));
	//td[@class='Hm']/img
	for(int j=0;j<we5.findElements(By.xpath("//td[@class='Hm']/img")).size();j++) {
	Driver.findElements(By.xpath("//td[@class='Hm']/img")).get(j).getAttribute("aria-label");
	if(Driver.findElements(By.xpath("//td[@class='Hm']/img")).get(j).getText().equalsIgnoreCase("Save & close")) {
		Driver.findElements(By.xpath("//td[@class='Hm']/img")).get(j).click();	
		Thread.sleep(4000);
	}
	}
	
	int size1=Driver.findElements(By.xpath("//div[@class='aio UKr6le']")).size();
	

	for(int k=0;k<size1;k++) {
	String Option=	Driver.findElements(By.xpath("//div[@class='aio UKr6le']/span/a")).get(k).getAttribute("title");
	
	if(Option.equalsIgnoreCase("Drafts")) {
	Driver.findElements(By.xpath("//div[@class='aio UKr6le']/span")).get(k).click();
		}}

		Thread.sleep(4000);
		WebElement we23=Driver.findElement(By.xpath("//div[2]/div/div[@class='Cp']/div/table/tbody"));
		for(int l=0;l<we23.findElements(By.xpath("tr[@jsmodel='nXDxbd']/td[6]/div/div/div/span/span")).size();l++) {
		String Subject=we23.findElements(By.xpath("tr[@jsmodel='nXDxbd']/td[6]/div/div/div/span/span")).get(l).getText();
		
		if(Subject.equalsIgnoreCase("Automated Mail")) {
			we23.findElements(By.xpath("tr[@jsmodel='nXDxbd']/td[6]/div/div/div/span/span")).get(l).click();	
			break;
		}
		}
	
		
	}
}
