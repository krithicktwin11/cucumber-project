package com.flipsteps;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.flipkart.resource.Commonactions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class TvPurchasesteps extends Commonactions {
	Commonactions c = new Commonactions();
	String name ="";
	@When("user search Tv")
	public void user_search_Tv() {
		name="SAMSUNG";
		WebElement search = driver.findElement(By.name("q"));
		c.insertext(name, search);
		//search.sendKeys(name+"tv",Keys.ENTER);
	}

	@When("user select the Tv and click add to cart")
	public void user_select_the_Tv_and_click_add_to_cart() {
		System.out.println("windowhandle");
		
	driver.findElement(By.xpath("(//div[contains(text(),'"+name+"')])[4]")).click();
		 
		   c.windowshandle();
		 /*  String parent= MobilePurchaseSteps. driver.getWindowHandle();
		   Set<String>child=MobilePurchaseSteps.driver.getWindowHandles();
		
		           for(String r:child){
			   if(!parent.equals(r)){
				   MobilePurchaseSteps.driver.switchTo().window(r);
			  }
		       }*/
		
	}

	@Then("user recieve the confirmation")
	public void user_recieve_the_confirmation() throws IOException {
//		TakesScreenshot ts= (TakesScreenshot)MobilePurchaseSteps.driver;
//	    File src=  ts.getScreenshotAs(OutputType.FILE);
//	   File d= new File("C:\\Users\\krith\\workspace\\cum-pro\\screenshot\\photo1.png");
//	   FileUtils.copyFile(src, d);
		c.screenshot();

	}

@When("user search Tv by using oneD")
public void user_search_Tv_by_using_oneD(DataTable dataTable) {
	List<String>datas = dataTable.asList();
	name=datas.get(0);
	WebElement search =driver.findElement(By.name("q"));
	search.sendKeys(name+"tv",Keys.ENTER);
//c.insertext(name, search);    
}
@When("user search Tv by using map")
public void user_search_Tv_by_using_map(DataTable dataTable) {
Map<String, String>datas =dataTable.asMap(String.class, String.class);
  name =datas.get("F11");
	
	WebElement search =driver.findElement(By.name("q"));
	//search.sendKeys(name+"tv",Keys.ENTER);
	c.insertext(name, search);
}
@When("user select the tv and click add to cart")
public void user_select_the_tv_and_click_add_to_cart() {
	System.out.println("windowhandle");
	
	driver.findElement(By.xpath("(//div[contains(text(),'"+name+"')])[4]")).click();
	 
	   c.windowshandle();
//	   String parent= MobilePurchaseSteps. driver.getWindowHandle();
//	   Set<String>child=MobilePurchaseSteps.driver.getWindowHandles();
//	
//	           for(String r:child){
//		   if(!parent.equals(r)){
//			   MobilePurchaseSteps.driver.switchTo().window(r);
//		  }
//}
	
    
}

}
