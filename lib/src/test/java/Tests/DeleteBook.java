package Tests;

import org.testng.annotations.Test;

import Pages.AddBookPage;
import Pages.DeleteBookPage;
import Pages.Loginpage;
import Util.TestUtil;

public class DeleteBook {
	
	@Test
	 public void DeleteBookTest () throws InterruptedException  
	 {

		
  	Loginpage loginpageobj=new Loginpage();
  	DeleteBookPage DeleteBookPageobj =new DeleteBookPage();
  	AddBookPage AddBookPageobj=new AddBookPage();
  	TestUtil.InitializePropertyFile();
		
  	
		loginpageobj.Loginfunc();
		AddBookPageobj.AddBookfunc(TestUtil.property.getProperty("DeleteBook"));
		DeleteBookPageobj.DeleteBookFunc(TestUtil.property.getProperty("DeleteBook"));
		loginpageobj.driver.quit();
	 }

}
