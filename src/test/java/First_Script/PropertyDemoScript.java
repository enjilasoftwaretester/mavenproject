package First_Script;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Second_Script.Base_Code;

public class PropertyDemoScript extends Base_Code 
{
  @Test
  public void LoginPage() 
  { 
	  driver.get(pp.getProperty("url"));
	  driver.findElement(By.xpath(pp.getProperty("username"))).sendKeys(pp.getProperty("userdata"));
	  driver.findElement(By.xpath(pp.getProperty("password"))).sendKeys(pp.getProperty("passdata"));
	  driver.findElement(By.xpath(pp.getProperty("login"))).click();
  }
}
