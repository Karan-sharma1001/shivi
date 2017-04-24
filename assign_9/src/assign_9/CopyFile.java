package assign_9;
import java.io.*;
import java.util.Scanner;

public class CopyFile {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	File f=new File(args[0]);
	File dest=new File(args[1]);
	FileOutputStream fos=null;//new FileOutputStream(args[1]);
	FileInputStream fis=null;//new FileInputStream(args[0]);
	
	
	if (f.exists()){
		
		if(dest.exists()){
		System.out.println("File exists... Do you want to overwrite??y/n");
		String x=sc.next();
		if(x.equals("y")||x.equals("Y")){
			dest.delete();
			try {
				 fos=new FileOutputStream(args[1]);
				 fis=new FileInputStream(args[0]);
				dest.createNewFile();
				int ch;
				while ((ch=fis.read())!=-1) {
				fos.write(ch);
				
				}
				System.out.print("File is overwritten please check");
			} catch (IOException e) {e.printStackTrace();}
			
		}
			
	}
		else{
			try {
				System.out.println("Else part is executed Refresh & chk project for dest.txt");
				 fos=new FileOutputStream(args[1]);
				 fis=new FileInputStream(args[0]);
				dest.createNewFile();
				int ch;
				while ((ch=fis.read())!=-1) {
				fos.write(ch);
				}
			} catch (IOException e) {e.printStackTrace();}
		}
			
	}
	else
		try {
		if (f.createNewFile())
		System.out.println("File created");
		else
			System.out.println("File not created");
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}
