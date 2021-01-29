package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver Intializedriver() throws IOException  {
		
    prop=new Properties();
		//
		//WebDriver driver = new Chromedriver()
		
FileInputStream fis = new FileInputStream("C:\\Users\\S A Basha\\eclipse-workspace\\Shop\\src\\main\\java\\resources\\data.properties");
prop.load(fis);

String browsername=prop.getProperty("browser");

if(browsername.equals("chrome")) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\setups\\chrome set up\\chromedriver.exe");
	driver= new ChromeDriver();
}

else if(browsername.equals("firefox")) {
	
	
}
else if(browsername.equals("IE")) {
	
	
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
	}

}
