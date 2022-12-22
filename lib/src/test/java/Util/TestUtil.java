package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestUtil {
	

		
		public static Properties property;
		private static String configpath = "Configuration/configsetting.properties";
		
		
		public static void InitializePropertyFile()
		{
			property =new Properties();
			try
			{
				InputStream instm=new FileInputStream(configpath);
				
				property.load(instm);
				
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
}


