package assign_9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class WriteEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values for employee int, String, int");
		Employee e1=new Employee(sc.nextInt(), sc.next(), sc.nextInt());
		System.out.println("Enter values for employee int, String, int");
		Employee e2=new Employee(sc.nextInt(), sc.next(), sc.nextInt());
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("emp.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(e1);
			FileInputStream fis=new FileInputStream("emp.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee p1=(Employee) ois.readObject();
			oos.writeObject(e2);
			Employee p2=(Employee) ois.readObject();
			fos.close();
			oos.close();
			
			
			
			System.out.println(p1);
			//closing all resources
			fis.close();
			ois.close();
		} catch (FileNotFoundException e) {			e.printStackTrace();	} 
		catch (IOException e) {		e.printStackTrace();	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
