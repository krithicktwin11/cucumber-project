package com.flipkart.resource;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	public static WebDriver driver;
	public void launch( String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
     public void login(WebElement close) {
    	 System.out.println("login");
  	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
  		close.click();

	}
     public void insertext(String name,WebElement search) {
    	
    		search.sendKeys(name,Keys.ENTER);
     }
     public void windowshandle() {
    	 String parent=  driver.getWindowHandle();
  	   Set<String>child=driver.getWindowHandles();
  	
  	           for(String r:child){
  		   if(!parent.equals(r)){
  			driver.switchTo().window(r);
  		  }
  	       } 
     }
     public void javascriptexecutor() {
    	   JavascriptExecutor j= (JavascriptExecutor)driver;
    	   j.executeScript("window.scrollBy(0,2500)","");
     }
     public void screenshot() throws IOException {
    	 TakesScreenshot ts= (TakesScreenshot)driver;
    	    File src=  ts.getScreenshotAs(OutputType.FILE);
    	   File d= new File("C:\\Users\\krith\\workspace\\cum-pro\\screenshot\\photo1.png");
    	   FileUtils.copyFile(src, d);

     }
}
