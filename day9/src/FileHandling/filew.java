package FileHandling;
import java.io.*;
public class filew {

	

	public static void main(String[] args) {
//		File f=new File("data.txt");
	/*	try {
			FileInputStream fis=new FileInputStream("D:\\501632\\day4\\src\\Testequal.java");
//			FileInputStream fis=new FileInputStream(f);
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
			FileReader fis1=new FileReader("source.txt");
			FileWriter fos1=new FileWriter("dest11.txt");
			int ch;
			//while(!(ch=fis1.read())){
			while ((ch=fis1.read())!=-1) {
			//System.out.print((char)ch);
				fos1.write(ch);
			}
		
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	}

