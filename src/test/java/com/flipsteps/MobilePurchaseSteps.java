package com.flipsteps;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
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

import com.flipkart.objectreprorisity.MobileValidatepage;
import com.flipkart.resource.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchaseSteps extends Commonactions {
	
	Commonactions c = new Commonactions();
	MobileValidatepage mv = new MobileValidatepage();
@Given("user launches flipkart application")
public void user_launches_flipkart_application() {
	/*System.out.println("launch");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
	//c.launch("https://www.flipkart.com/");
}

@Given("user handles the login")
public void user_handles_the_login() {
	System.out.println("login");
	   //WebElement close=   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		//close.click();
	mv.getClose().click();
}
   String name = "";
@When("user search mobile")
public void user_search_mobile() {
   name="realme";
	//WebElement search = driver.findElement(By.name("q"));
	//search.sendKeys(name,Keys.ENTER);
   c.insertext(name, mv.getSearch());
}

@When("user select the mobile and click add to cart")
public void user_select_the_mobile_and_click_add_to_cart() {
	//System.out.println("windowhandle");
	   
	   driver.findElement(By.xpath("(//div[contains(text(),'"+name+"')])[2]")).click();
	 
	   c.windowshandle();
	  /* String parent=  driver.getWindowHandle();
	   Set<String>child=driver.getWindowHandles();
	
	           for(String r:child){
		   if(!parent.equals(r)){
			driver.switchTo().window(r);
		  }
	       } */
}

@When("user doing the payment")
public void user_doing_the_payment() {
	   System.out.println("Screenshot");
	   
	   // JavascriptExecutor j= (JavascriptExecutor)driver;
	//   j.executeScript("window.scrollBy(0,2500)","");
	 
}

@Then("user recieve the confirmation message")
public void user_recieve_the_confirmation_message() throws IOException {
	c.screenshot();
	/*TakesScreenshot ts= (TakesScreenshot)driver;
    File src=  ts.getScreenshotAs(OutputType.FILE);
   File d= new File("C:\\Users\\krith\\workspace\\cum-pro\\screenshot\\photo1.png");
   FileUtils.copyFile(src, d);*/

}

@When("user search mobile in oneD map")
public void user_search_mobile_in_oneD_map(DataTable dataTable) { 
	 
	Map<String, String> datas = dataTable.asMap(String.class, String.class);
	    name = datas.get("A11");
	 
	  
	  //WebElement search = driver.findElement(By.name("q"));
		c.insertext(name, mv.getSearch());
  
}

@When("user search mobile {string}")
public void user_search_mobile(String mobile) {
	name = mobile;
	//WebElement search = driver.findElement(By.name("q"));
	c.insertext(name, mv.getSearch());
}
}




