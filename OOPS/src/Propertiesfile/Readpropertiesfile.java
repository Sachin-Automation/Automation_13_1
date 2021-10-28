package Propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readpropertiesfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("F:\\WORKSPACE\\OOPS\\testdata.properties");
		
		Properties pro=new Properties();
		
		pro.load(fis);
		
		String Name=pro.getProperty("name");
				System.out.println(Name);
				System.out.println(pro.getProperty("Name"));
				System.out.println(pro.getProperty("At.Post"));
				System.out.println(pro.getProperty("Ta"));
				System.out.println(pro.getProperty("Dist"));
				System.out.println(pro.getProperty("Mobile-number"));
				System.out.println(pro.getProperty("collage"));
				System.out.println(pro.getProperty("Bike-number"));
				

	}

}

