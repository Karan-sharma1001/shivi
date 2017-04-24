package FileHandling;

import java.io.Serializable;

public class Pizza implements Serializable{
private String name;
//transient private String name; //to not consider in serialization to write in file
private int quantity;
@Override
public String toString() {
	return  name + "  |  " + quantity ;
}
public Pizza(String name, int quantity) {
	super();
	this.name = name;
	this.quantity = quantity;
}

		
}
