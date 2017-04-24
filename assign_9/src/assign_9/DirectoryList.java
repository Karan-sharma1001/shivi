package assign_9;

import java.io.File;
import java.util.Scanner;

public class DirectoryList {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of directory");
		String z=sc.next();
		File f1=new File(z);
		if (f1.isDirectory())
		{
			System.out.println(f1.list());
		}
		else
			System.out.println("Directory Not exists");
		
	}

}
