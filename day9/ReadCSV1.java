package FileHandling;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadCSV1 {
	public static void main(String[] args) {
		try 
		{
			//reading file
			FileReader fr=new FileReader("mycsv.txt");
			BufferedReader br=new BufferedReader(fr);
			String str;
			while((str=br.readLine())!=null)
			{
				String s[]=str.split(",");
				double d=Double.parseDouble(s[0]);
				System.out.println(d);
				String n1=s[1];
				System.out.println(n1);
				String n2=s[2];
				System.out.println(n2);
				int ival=Integer.parseInt(s[3]);
				System.out.println(ival);
				
			}
		}
		catch (FileNotFoundException e1)
		{
			e1.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
