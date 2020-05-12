import java.util.Scanner;
class UserDefinedException{
public static void main(String[]args)throws Exception{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age to check Eligibility");
int age= sc.nextInt();
if(age>=18)
System.out.println("Eligibility for voting");
else
throw new Exception("Not Eligible for voting");
}
}
