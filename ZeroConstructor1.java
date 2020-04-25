import java.util.Scanner;

public class ZeroConstructor1 {
	String order;
	
	ZeroConstructor1(){ //no argument default constructor
		System.out.println("Default value");
	}
		
}
public class DefaultDemo {
	public static void main(String[]args){
		ZeroConstructor1 x = new ZeroConstructor1();
		System.out.println(x.order);
	}
}




