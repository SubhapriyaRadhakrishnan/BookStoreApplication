package Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class AddBookPage extends Loginpage {
	

	@FindBy(xpath="//span[text()='Book Store']//parent::li")
	   public static WebElement ButtonBookStore;

	 
	  @FindBy(xpath="//input[@id='searchBox']")
	    public static WebElement TextBoxSearchBox;
	
	  @FindBy(xpath="//button[text()='Add To Your Collection']")
	    public static WebElement ButtonAdd;
	  
	  @FindBy(xpath="//span[text()='Profile']//parent::li")
	    public static WebElement ButtonProfile;
	
	 
	  public void AddBookfunc(String BookName) throws InterruptedException
	  {
		 
try
{
		  PageFactory.initElements(Loginpage.driver, AddBookPage.class);
		  JavascriptExecutor js1 = (JavascriptExecutor) driver;
		  js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
		  
			 
			 
			 ButtonBookStore.click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchBox']")));
			 		 
		
			 TextBoxSearchBox.click();
			 TextBoxSearchBox.sendKeys(BookName);
			 (Loginpage.driver.findElement(By.xpath("//a[contains(text(),'"+BookName+"')]"))).click();
			
			 js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add To Your Collection']")));
			 ButtonAdd.click();
			 Thread.sleep(1000);
			 Alert alert = driver.switchTo().alert();
			 alert.accept();	
			 ButtonProfile.click();
			 (Loginpage.driver.findElement(By.xpath("//a[contains(text(),'"+BookName+"')]"))).isDisplayed();
			 
}
		  	  
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }

	  }

}
