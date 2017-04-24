package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FR {
public static void main(String[] args) {
		
	 	try {
			FileReader fr=new FileReader("data.txt");
			int ch;
			while ((ch=fr.read())!=-1) {
				System.out.print((char)ch);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	
		
	 	
	 	
}
}
