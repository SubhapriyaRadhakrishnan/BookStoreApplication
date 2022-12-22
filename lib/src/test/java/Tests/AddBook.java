package Tests;

import org.testng.annotations.Test;

import Pages.AddBookPage;
import Pages.DeleteBookPage;
import Pages.Loginpage;
import Util.TestUtil;

public class AddBook {
	
	@Test
	 public void AddBookTest () throws InterruptedException  
	 {

		
   	Loginpage loginpageobj=new Loginpage();
   	DeleteBookPage DeleteBookPageobj =new DeleteBookPage();
   	AddBookPage AddBookPageobj=new AddBookPage();
   	TestUtil.InitializePropertyFile();
		
   	
		loginpageobj.Loginfunc();
		DeleteBookPageobj.DeleteBookFunc(TestUtil.property.getProperty("AddBook"));
		AddBookPageobj.AddBookfunc(TestUtil.property.getProperty("AddBook"));
		Thread.sleep(1000);
		DeleteBookPageobj.DeleteBookFunc(TestUtil.property.getProperty("AddBook"));
	
		loginpageobj.driver.quit();
	 }
	

}
