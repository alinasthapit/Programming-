import java.util.Scanner;

public class MethodOverloading1 {
	void menu(String order1, String order2){
		System.out.println("Selected menu are " + order1 + " and " + order2);
	}
	void menu(String order3){
		System.out.println("Added order in previous menu is " + order3);
	}
	
 }
public class MoverloadingDemo {
	public static void main(String[]args){
		MethodOverloading1 myObj = new MethodOverloading1();
		myObj.menu("Desert", "Appetizer");
		myObj.menu("Lunch");
	}

}

