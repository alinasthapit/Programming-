class Exception1Demo{
public static void main(String[]args){
int a=10,b=0;
System.out.println("statement 1 and sum=" +(a+b));
try{
System.out.println("statement 2 and divide=" +(a/b)); 
}
catch(ArithmeticException x) // x=new ArithmeticException()
{
System.out.println(x.getMessage());
}
System.out.println("statement 3 and multiply=" +(a*b));
System.out.println("statement 4 and subtract=" +(a-b));
}
}


OUTPUT

$javac ExceptionDemo.java
$java -Xmx128M -Xms16M ExceptionDemo
statement 1 and sum=10
/ by zero
statement 3 and multiply=0
statement 4 and subtract=10