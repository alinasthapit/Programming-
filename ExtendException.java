import java.util.Scanner;
class Vote extends Exception{
 Vote(String msg){
 System.out.println(msg);
}
}

class UserDefinedException{
public static void main(String[]args)throws Exception{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age to check Eligibility");
int age=sc.nextInt();
if(age>=18)
System.out.println("Eligibility for voting");
else
throw new Vote("Not Eligible for voting");
}
}
