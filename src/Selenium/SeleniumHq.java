package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHq {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:/Users/Murodil Ruzimatov/Documents/Librares/drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.seleniumhq.org");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String title=driver.getTitle();
	System.out.println(title);
	
	String actualTitle=("Selenium - Web Browser Automation");
	
	if(actualTitle.equals(title)){
		System.out.println("You got it!");
	}
	
//	driver.manage().window().maximize();	
	driver.findElement(By.linkText("Projects")).click();
	driver.findElement(By.linkText("Selenium WebDriver")).click();
	
	driver.findElement(By.linkText("Download")).click();
	
	driver.findElement(By.id("q")).sendKeys("Cucamber selenium");
	driver.findElement(By.id("submit")).click();
	
	String results=driver.findElement(By.id("resInfo-0")).getText();
	System.out.println(results);
	
	
	
	}

}
