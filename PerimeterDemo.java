import java.util.Scanner;
public class Perimeter {
final double pi = 3.1414;
int radius;
void input(){
	Scanner x = new Scanner(System.in);
	System.out.println("Enter the value for radius");
	radius = x.nextInt();
}
void perimeterofCircle(){
	System.out.println("Perimeter of a circle is " + (2 * pi * radius));
}
}
class PerimeterDemo {
	public static void main(String[]args){
		Perimeter y = new Perimeter();
		y.input();
		y.perimeterofCircle();
	}
}
