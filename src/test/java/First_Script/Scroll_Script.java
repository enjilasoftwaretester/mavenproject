package First_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Second_Script.Base_Code;

public class Scroll_Script extends Base_Code 
{
  @Test
  public void ScrollPage() throws InterruptedException 
  {
	  driver.get("https://www.selenium.dev/downloads/");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  
	  WebElement ch=driver.findElement(By.linkText("Chrome"));
	  js.executeScript("arguments[0].scrollIntoView()",ch );
	  
	  System.out.println(ch.getText());
	  Thread.sleep(5000);
	  
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  Thread.sleep(5000);
	  js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	  Thread.sleep(5000);
  }
}
