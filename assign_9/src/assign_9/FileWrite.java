package assign_9;

import java.io.*;
import java.util.Scanner;

public class FileWrite {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	File f1= new File("Letter.txt");
	FileWriter fw=null;//new FileWriter(f1);
	FileReader fr=null;
	BufferedWriter writer=null;
	try {
		fw=new FileWriter(f1);
		writer = new BufferedWriter(fw);
	for (int i = 0; i < 5; i++) {
		System.out.println("enter next line "+i);
		 String text = sc.nextLine();
		 writer.write(text);
         writer.newLine();
     
	}
    writer.close();
    System.out.println("Length of file is"+f1.length());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		int z;
	
	try {
		fr=new FileReader(f1);
		while((z=fr.read())!=-1){
				System.out.print((char)z);
		}
	} catch (IOException e) {
		
	}
finally{
	try {
		fw.close();
	
	} catch (IOException e) {	e.printStackTrace();}

}
}
}
