package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Propertyfile {


		
		public String getPfile(String key) throws IOException {
			
			Properties p =new Properties();
			FileInputStream fis=new FileInputStream(Autoconstant.Filepath);
			p.load(fis);
			return p.getProperty(key);
			
			
		}

	}


