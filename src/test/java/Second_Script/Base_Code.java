package Second_Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Code 
{
	public WebDriver driver;
	public Properties pp;
	
	@BeforeTest
	  public void launchBrowser() throws FileNotFoundException, IOException 
	  {
		pp=new Properties();
		pp.load(new FileInputStream("src//test//resources//Pr_Folder//PrScript.properties"));
		String Browser=pp.getProperty("browser");
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		  ChromeOptions co =new ChromeOptions ();
		  co.addArguments("--remote-allow-origins=*");
		  driver=new ChromeDriver(co);
		  driver.manage().window().maximize();		
		}
	  }	
	  @AfterTest
	  public void CloseBrowser()
	  {
		  driver.close();
	  }
}
