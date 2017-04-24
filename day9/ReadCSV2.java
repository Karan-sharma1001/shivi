package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ReadCSV2 {
	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("mycsv.txt");
			BufferedReader br=new BufferedReader(fr);
			String msg;
			while((msg=br.readLine())!=null){
				StringTokenizer st=new StringTokenizer(msg,",");
				while(st.hasMoreTokens()){					
					double sal=Double.parseDouble(st.nextToken());
					System.out.println(sal);
					String fname=st.nextToken();
					System.out.println(fname);
					String lname=st.nextToken();				
					System.out.println(lname);
					int empid=Integer.parseInt(st.nextToken());
					System.out.println(empid);
				}
			}	
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		}
	}
}
