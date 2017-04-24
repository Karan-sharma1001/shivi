package FileHandling;
import java.io.*;
public class FISDemo {
public static void main(String[] args) {
//	File f=new File("data.txt");
/*	try {
		FileInputStream fis=new FileInputStream("D:\\501632\\day4\\src\\Testequal.java");
//		FileInputStream fis=new FileInputStream(f);
		int ch;
						while ((ch=fis.read()) != -1)
								{
							
							System.out.print((char)ch);//convert to ascii 
						}
						
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	try {
		FileInputStream fis=new FileInputStream("source.txt");
		FileOutputStream fos=new FileOutputStream("dest.txt");
		int ch;
		while ((ch=fis.read())!=-1) {
		
			fos.write(ch);
		}
	
	} catch (FileNotFoundException e) {
	
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}

}
}
