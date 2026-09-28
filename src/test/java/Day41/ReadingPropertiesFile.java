package Day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//create obj of perperties file
           Properties propertiesobj=new Properties();
           //location of properties file
           FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\test data\\config.properties");
	       //loading properties file
           propertiesobj.load(file);
           //reading data from file
           String url=propertiesobj.getProperty("apurl");
           String email=propertiesobj.getProperty("email");
           String password=propertiesobj.getProperty("password");
           String ordid=propertiesobj.getProperty("orderid");
           String cusid=propertiesobj.getProperty("customerid");
           
           System.out.println(url+" "+email+" "+password+" "+ordid+" "+cusid);
           
	//reading all the keys from property file
           //1)approach1
          //Set<String> keys= propertiesobj.stringPropertyNames();
	      //System.out.println(keys);//[password, orderid, customerid, apurl, email]
	
           //2)approach2
	      Set<Object> keys=propertiesobj.keySet();
	      System.out.println(keys);//[password, orderid, customerid, apurl, email]
	      
	      //reading all the values from property file
	     Collection<Object> values=propertiesobj.values();
	     System.out.println(values);//[abcxyz, 123, 234, https://demo.opencart.com/, abc@gmail.com]
	     
	    file.close();
	}

}
