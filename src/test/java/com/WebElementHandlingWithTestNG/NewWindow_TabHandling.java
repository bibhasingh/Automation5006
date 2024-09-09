package com.WebElementHandlingWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewWindow_TabHandling {
  @Test
  public void newTabTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("Https://www.google.com");
	  for(int i=1;i<=10;i++)
	  {
	  WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
	  newTab.get("https://www.facebook.com");
	  }
	  
  }
  
  @Test
  public void newWindowTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("Https://www.google.com");
	  WebDriver newWindow=driver.switchTo().newWindow(WindowType.WINDOW);
	  newWindow.get("https://www.amazon.com");
	  
  }
  
  /*
   * First open google and 
   * then in new window open facebook 10  times in 10 different tabs

   */
  @Test
  public void scenario()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println("Google open");
	  
	  WebDriver nWindow=driver.switchTo().newWindow(WindowType.WINDOW);
	  
	  //newWindow.get("https://www.facebook.com");
	  for(int i=1;i<=10;i++)
	  {
	  WebDriver newTab=nWindow.switchTo().newWindow(WindowType.TAB);
	  newTab.get("https://www.facebook.com");
	  }
  }
}
