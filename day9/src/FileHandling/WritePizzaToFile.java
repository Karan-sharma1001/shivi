package FileHandling;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritePizzaToFile {
public static void main(String[] args) {
	Pizza p=new Pizza("Delux Margarita",5);

	
	//Write an object into a file-FOS DOS  
	try {
		FileOutputStream fos=new FileOutputStream("pizzainfo.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeBytes(p.toString());
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	//Read an object from the file- FIS DIS
	
	
	//Closing all Resources
	
	
}
}
