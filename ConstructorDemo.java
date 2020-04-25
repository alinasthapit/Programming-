import java.util.Scanner;
public class ConstructorOverloading1 {
    ConstructorOverloading1(int id, int age){
		this("Kathmandu");
		System.out.println("id= " + id);
		System.out.println("age= " + age);
    }
	ConstructorOverloading1(String address){
		System.out.println("Address " + address);
	}
}

public class ConstructorDemo {
	public static void main(String[]args){
		ConstructorOverloading1 student = new ConstructorOverloading1(12, 16);
		
	}

}
