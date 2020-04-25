import java.util.Scanner;

public class ParaConstructor {
	String order1;
	String order2;
	
ParaConstructor(String x, String y){
	order1 = x;
	order2 = y;
 }

void menu(){
	System.out.println("Order1 is " + order1);
	System.out.println("Order2 is " + order2);
 }
}
public class ParaDemo {
	public static void main(String[]args){
		ParaConstructor obj = new ParaConstructor("Desert", "Dinner");
		obj.menu();
		}

}


