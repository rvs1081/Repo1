package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	 WebDriver driver;
	@BeforeClass
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
  @Test
   public void f() {


  }
}
