import java.util.Scanner;

class Laptop {
	void cost(){
		System.out.println("No Cost");
	}
	void memory(){
		System.out.println("No Memory");
	}
}
class Dell extends Laptop{
	void cost(){
		System.out.println("Dell's cost is 900 dollars");
	}
	void memory(){
		System.out.println("Dell has 64 GB memory");
	}
}
class Lenovo extends Laptop{
	void cost(){
		System.out.println("Lenovo's cost is 800 dollars");
	}
	void memory(){
		System.out.println("Lenovo has 32 GB memory");
	}
}
public class MethodOverridingDemo {
	public static void main(String[]args){
		Laptop x = new Laptop();
		x.cost();
		x.memory();
		x = new Dell();
		x.cost();
		x.memory();
		x = new Lenovo();
		x.cost();
		x.memory();
	}

}
