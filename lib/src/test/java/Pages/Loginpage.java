package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.TestUtil;

public class Loginpage {
	
	
	  @FindBy(xpath="//span[text()='Login']//parent::li")
	    public static WebElement ButtonLogin;
	   
	   @FindBy(xpath="//input[@id='userName']")
	   public static WebElement TextboxUsername;
	   
	   @FindBy(xpath="//input[@id='password']")
	   public static WebElement TextboxPassword;
	   
	   @FindBy(xpath="//button[@id='login']")
	   public static WebElement ButtonUserlogin;
	   
	   @FindBy(xpath="//div[text()='Profile']")
	   public static WebElement TextProfile;
	   
	  
	   public static WebDriver driver;
	   @SuppressWarnings("deprecation")
	public void Loginfunc()
	   {
		   
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohankumar Nataraj\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			TestUtil.InitializePropertyFile();
			driver.get(TestUtil.property.getProperty("url"));
			 
			 
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			 PageFactory.initElements(driver, Loginpage.class);
			 
			 
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   ButtonLogin.click();
		   TextboxUsername.sendKeys(TestUtil.property.getProperty("Username"));
		   TextboxPassword.sendKeys(TestUtil.property.getProperty("Password"));
		   
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   ButtonUserlogin.click();
			 // ButtonUserlogin.click();
		  (driver.findElement(By.xpath("//button[text()='Log out']"))).isDisplayed();

	   }


}
