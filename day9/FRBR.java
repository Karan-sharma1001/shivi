package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FRBR {
	public static void main(String[] args) {

		FileReader fr=null;
		FileWriter fw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;

		try {
			fr=new FileReader("source1.txt");
			fw=new FileWriter("dest1.txt");
			br=new BufferedReader(fr);
			bw=new BufferedWriter(fw);

			String data;
			while((data=br.readLine())!=null)
			{
				bw.write(data);
			}


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally
		{
			try {
				bw.close();
				br.close();
				fw.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
}
