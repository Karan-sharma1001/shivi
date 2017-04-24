package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadCSV3 {
	public static void main(String[] args) {
		try {
			FileReader fis=new FileReader("mycsv.txt");
			BufferedReader br=new BufferedReader(fis);
			String msg;
			//int i=0;
			Scanner sc;
			//product p[]=new product[]
			while((msg=br.readLine())!=null)
			{
				sc=new Scanner(msg);
				sc.useDelimiter(",");
				double sal=sc.nextDouble();
				System.out.println(sal);
				String fname=sc.next();
				System.out.println(fname);
				String lname=sc.next();
				System.out.println(lname);
				int eid=sc.nextInt();
				System.out.println(eid);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
