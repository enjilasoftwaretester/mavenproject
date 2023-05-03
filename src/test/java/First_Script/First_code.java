package First_Script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Second_Script.Base_Code;
import io.github.bonigarcia.wdm.WebDriverManager;

public class First_code extends Base_Code
{	
  @Test
  public void dropDown() throws InterruptedException 
  {
	  driver.get("https://blazedemo.com/");
	  WebElement from=driver.findElement(By.name("fromPort"));
	  Select s=new Select(from);
	  Thread.sleep(2000);
	  List<WebElement> allOptions=s.getOptions();
	  System.out.println(allOptions.size());
	  
	  for(int i=0; i<allOptions.size();i++)
	  {
		  System.out.println(allOptions.get(i).getText());
	  }	  
  }
  
}
