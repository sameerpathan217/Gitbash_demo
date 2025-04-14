package Genric_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


/**
 * This class consist of reusable method related to property filr
 * @author SAMEER PATHAN
 *
 */
public class PropertyFile {
	/**
	 * 
	 * @param data
	 * @return
	 * @throws IOException
	 */

	public String getPropertyData(String data) throws IOException {
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.properties");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(data);
		return value;
		
	}
	
}
