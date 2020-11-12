import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StringProcessor {
	
	static void stringprinter(String inputString)
	{
			
		StringTokenizer st=new StringTokenizer(inputString, "=");
			
			String kom1= st.nextToken();
			String kom2 = st.nextToken();
			System.out.println("The" +kom1+ "is" +kom2);
			
	}
}

