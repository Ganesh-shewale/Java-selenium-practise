package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LocatorReader {
	private Properties prop;
	
	public LocatorReader(String filepath) throws IOException
	{
		prop=new Properties();
		
		try {
			FileInputStream fis =new FileInputStream(filepath);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getLocator(String key)
	{
		return prop.getProperty(key);
	}
	

}
