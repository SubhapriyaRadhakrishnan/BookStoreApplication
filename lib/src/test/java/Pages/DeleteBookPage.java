package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteBookPage extends Loginpage {
	
	@FindBy(xpath="//span[@id='delete-record-undefined']")
	   public static WebElement DeleteIcon;
	
	@FindBy(xpath="//button[@id='closeSmallModal-ok']")
	   public static WebElement ButtonOk;
	
	public void DeleteBookFunc(String BName) throws InterruptedException
	{
		try
		{
			if((Loginpage.driver.findElement(By.xpath("//a[text()='"+BName+"']//following::span[1]"))).isDisplayed())
			{
		
		AddBookPage AddBookPageobj=new AddBookPage();
		PageFactory.initElements(Loginpage.driver, DeleteBookPage.class);
		(Loginpage.driver.findElement(By.xpath("//a[text()='"+BName+"']//following::span[1]"))).click();
		 ButtonOk.click();
		 Thread.sleep(1000);
		 Alert alert = Loginpage.driver.switchTo().alert();
		 alert.accept();
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}



