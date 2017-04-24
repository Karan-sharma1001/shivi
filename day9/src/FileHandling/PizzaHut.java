package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class PizzaHut {

	public static void main(String[] args) {
//create an object
		Pizza p=new Pizza("Delux Margarita",5);

		try {
			//1.serialization- FOS,OOS
			FileOutputStream fos=new FileOutputStream("pizzainfo.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(p);
			fos.close();
			oos.close();
			
			//2.Deserialization FIS,OIS
			FileInputStream fis=new FileInputStream("pizzainfo.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Pizza p1=(Pizza) ois.readObject();
			System.out.println(p1);
			//closing all resources
			fis.close();
			ois.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
