package FileHandling;

import java.io.File;
import java.io.IOException;

public class Filedemo {
public static void main(String[] args) {
	
	File f=new File("data.txt");                          	
if (f.exists())
	System.out.println("File exists");
else
	try {
	if (f.createNewFile())
	System.out.println("File created");
	else
		System.out.println("FIle not created");
	} catch (IOException e) {
		e.printStackTrace();
	}


}
}
