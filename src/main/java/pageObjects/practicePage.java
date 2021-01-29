package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practicePage {
	
	
	public WebDriver driver;
	
	By Radiobutton = By.xpath("//input[@value='radio2']");
	By suggestionclass = By.xpath("//input[@id='autocomplete']");
	By Selector = By.id("dropdown-class-example");
	By droplist=By.xpath("//ul[@id='ui-id-1']/li/div");
	By Checkbox= By.xpath("//input[@id='checkBoxOption1']");
	
	By Windowhandle = By.xpath("//button[@onclick='openWindow()']");
	By switchtotab = By.xpath("//a[@id='opentab']");
	By Alertname = By.xpath("//input[@id='name']");
	By Alert = By.xpath("//input[@value='Alert']");
	By Confirm = By.xpath("//input[@value='Confirm']");
	By table = By.xpath("//table[@border='1']/tbody/tr[6]/td[2]");
	By elementdisplayed = By.xpath("//input[@value='Show']");
	By displayedtext = By.xpath("//input[@name='show-hide']");
	By elementhide = By.xpath("//input[@value='Hide']");
	By webtablefixedheader = By.xpath("//*[@class='tableFixHead']/table/tbody/tr[2]/td[3]");
	By mouseover = By.id("mousehover");
	By iframe = By.cssSelector("iframe[name='iframe-name']");
	By links = By.xpath("//div[@id='gf-BIG']/table/tbody");
	
	
	public practicePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement getradiobutton()
	{
		return driver.findElement(Radiobutton);
	}

	public WebElement getsugesstionclass()
	{
		return driver.findElement(suggestionclass);
	}

	public WebElement getselector()
	{
		return driver.findElement(Selector);
	}

	public WebElement getcheckbox()
	{
		return driver.findElement(Checkbox);
	}

	public WebElement getwindowhandle()
	{
		return driver.findElement(Windowhandle);
	}

	public WebElement getswitchtotab()
	{
		return driver.findElement(switchtotab);
	}

	public WebElement getalertname()
	{
		return driver.findElement(Alertname);
	}

	public WebElement getalert()
	{
		return driver.findElement(Alert);
	}

	public WebElement getconfirm()
	{
		return driver.findElement(Confirm);
	}

	public WebElement gettable()
	{
		return driver.findElement(table);
	}

	public WebElement getelementdisplayed()
	{
		return driver.findElement(elementdisplayed);
	}

	public WebElement getdisplayed()
	{
		return driver.findElement(displayedtext);
	}

	public WebElement gethideelement()
	{
		return driver.findElement(elementhide);
	}

	public WebElement getwfheader()
	{
		return driver.findElement(webtablefixedheader);
	}

	public WebElement getmouseover()
	{
		return driver.findElement(mouseover);
	}

	public WebElement getiframe()
	{
		return driver.findElement(iframe);
	}

	public WebElement getlinks()
	{
		return driver.findElement(links);
	}
	
	public WebElement getlist()
	{
		return driver.findElement(droplist);
	}

	
	
}
