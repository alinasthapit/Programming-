import java.util.Scanner;
public class TwoDimensionArray{
public static void main(String[]args){
int a[][]=new int[4][4];
Scanner sc=new Scanner(System.in);
for(int i=0; i<4; i++){
for(int j=0; j<4; j++){
System.out.println("Enter a number ");
a[i][j]=sc.nextInt();
}
}
for(int i=0; i<4; i++){
for(int j=0; j<4; j++){
System.out.println("a["+i+"]["+j+"]=" +a[i][j]);
}
System.out.println();
}
}
}