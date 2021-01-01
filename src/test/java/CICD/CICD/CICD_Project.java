package CICD.CICD;

//testng
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

//selenium
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CICD_Project
{
  @Test
  public void f() 
  {
	  
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	  // Set the driver path
	  System.setProperty("webdriver.edge.driver", "G:\\Softwares Downloads\\edgedriver_win64\\EdgeDriver.exe");

	  // Start Edge Session
	  WebDriver driver = new EdgeDriver();
	  
	  //Lauch the talentx
	  driver.get("https://talentx.kgisl.com/");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
