import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MyClass{
	
	public static void main( String []args){
		//Read properties file
		
		Properties properties = new Properties();
		
		try{
		
			//load properties file from filepath
			
			properties.load(new FileInputStream("filepaths.properties"));
			
			}catch(IOException e) {}
			String txtpath = properties.getProperty("path");
			System.out.println("The parameter of path is"+txtpath);
			//properties.setProperty("path","H timh tou path tha isoutai me to path tou measurements.txt sto disko");	
			
	
	
			String str=new String();
	
			try {
				FileReader filerdr = new FileReader(txtpath);
				BufferedReader in =new BufferedReader(filerdr);
				String line ;
				int counter=0;
				
				while ((line=in.readLine())!=null) {
					counter ++;
					if (counter!=1)
						StringProcessor.stringprinter(line);
				}
				filerdr.close();
				in.close();
			}catch(IOException e) {
				System.out.println("Error:File hasn't loaded");
			}
		
	}
}
