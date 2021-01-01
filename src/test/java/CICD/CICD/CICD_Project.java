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
  //Gobal Declaration
  WebDriver driver;
  
  @Test
  public void loginValidCredentials() 
  {
	  WebElement username=driver.findElement(By.id("Username"));
	  username.sendKeys("smhussain.r");
	  driver.findElement(By.id("Password")).sendKeys("Rvt@1234567");;
	  WebElement login=driver.findElement(By.xpath("//*[@id='frmLogin']/fieldset/div[2]/button/span"));
	  login.click();
	  System.out.println("Sheik loged In");
  }
  
  @Test
  public void loginValidInvalidCredentials() 
  {
	  WebElement username=driver.findElement(By.id("Username"));
	  username.sendKeys("smhussain.r");
	  driver.findElement(By.id("Password")).sendKeys("Rvt@123");;
	  WebElement login=driver.findElement(By.xpath("//*[@id='frmLogin']/fieldset/div[2]/button/span"));
	  login.click();
	  System.out.println("Invalid User Name and Password");
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
  public void afterTest() 
  {
	  driver.quit();
  }

}
