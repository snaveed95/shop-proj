package project2;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.practicePage;
import resources.base;

public class FrontPage extends base{
	
	public WebDriver driver;
	
	@BeforeTest
	public void Intialize() throws IOException
	{
		driver=Intializedriver();
		
	}

	@Test
	
	public void pracproj2() 
	{
		driver.get(prop.getProperty("url"));
		practicePage p= new practicePage(driver);
		
		p.getradiobutton().click();
		p.getsugesstionclass().sendKeys("ind");
		List<WebElement> options=droplist;
		
	for(WebElement option:options) {
		if(option.getText().equalsIgnoreCase("India")) {
			option.click();
			break;
		}
	}
		
	}
	
	
}
